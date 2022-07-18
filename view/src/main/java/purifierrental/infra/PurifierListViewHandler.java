package purifierrental.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import purifierrental.config.kafka.KafkaProcessor;
import purifierrental.domain.*;

@Service
public class PurifierListViewHandler {

    @Autowired
    private PurifierListRepository purifierListRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPurifierReturned_then_CREATE_1(
        @Payload PurifierReturned purifierReturned
    ) {
        try {
            if (!purifierReturned.validate()) return;

            // view 객체 생성
            PurifierList purifierList = new PurifierList();
            // view 객체에 이벤트의 Value 를 set 함
            purifierList.setPurifierStatus("rented");
            // view 레파지 토리에 save
            purifierListRepository.save(purifierList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaid_then_UPDATE_1(@Payload Paid paid) {
        try {
            if (!paid.validate()) return;
            // view 객체 조회
            Optional<PurifierList> purifierListOptional = purifierListRepository.findByPurifierId(
                paid.getPayId()
            );

            if (purifierListOptional.isPresent()) {
                PurifierList purifierList = purifierListOptional.get();
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                // view 레파지 토리에 save
                purifierListRepository.save(purifierList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenRepairRequested_then_UPDATE_2(
        @Payload RepairRequested repairRequested
    ) {
        try {
            if (!repairRequested.validate()) return;
            // view 객체 조회

            List<PurifierList> purifierListList = purifierListRepository.findByRepairId(
                repairRequested.getToyId()
            );
            for (PurifierList purifierList : purifierListList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                purifierList.setPurifierStatus("repaired");
                // view 레파지 토리에 save
                purifierListRepository.save(purifierList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPayCancelled_then_DELETE_1(
        @Payload PayCancelled payCancelled
    ) {
        try {
            if (!payCancelled.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            purifierListRepository.deleteByPurifierStatus(
                payCancelled.getPayStatus()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenRentalCancelled_then_DELETE_2(
        @Payload RentalCancelled rentalCancelled
    ) {
        try {
            if (!rentalCancelled.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            purifierListRepository.deleteByPurifierStatus(
                rentalCancelled.getRentalStatus()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // keep

}
