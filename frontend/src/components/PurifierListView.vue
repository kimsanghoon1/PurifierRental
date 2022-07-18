<template>

    <v-data-table
        :headers="headers"
        :items="purifierList"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'PurifierListView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "purifierId", value: "purifierId" },
                { text: "name", value: "name" },
                { text: "purifierStatus", value: "purifierStatus" },
                { text: "purifierRentalPrice", value: "purifierRentalPrice" },
                { text: "rentalId", value: "rentalId" },
                { text: "repairId", value: "repairId" },
                { text: "repairmanId", value: "repairmanId" },
            ],
            purifierList : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/purifierLists'))

            temp.data._embedded.purifierLists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.purifierList = temp.data._embedded.purifierLists;
        },
        methods: {
        }
    }
</script>

