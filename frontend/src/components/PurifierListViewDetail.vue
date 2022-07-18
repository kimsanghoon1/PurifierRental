<template>

    <v-card outlined>
        <v-card-title>
            PurifierList # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="PurifierId" v-model="item.purifierId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Name" v-model="item.name" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PurifierStatus" v-model="item.purifierStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="PurifierRentalPrice" v-model="item.purifierRentalPrice" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="RentalId" v-model="item.rentalId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="RepairId" v-model="item.repairId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="RepairmanId" v-model="item.repairmanId" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'PurifierListViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/purifierLists/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

