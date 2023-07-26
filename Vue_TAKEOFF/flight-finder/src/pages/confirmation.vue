<template>

    <div>
        <h2> Thank you! Your hotel has been booked. Your confirmation code is: </h2>
        <h2> {{ confirmationCode }}</h2>
    </div>


</template>


<script>
    export default {
        data () {
            return {
                confirmationCode: null
            }
        },
        methods:  {
            generateConfirmationCode() {
                const length = 20;
                const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
                let confirmationCode = '';

                for (let i = 0; i < length; i++) {
                    const randomIndex = Math.floor(Math.random() * characters.length);
                    confirmationCode += characters.charAt(randomIndex);
                }

                return confirmationCode;
            }
        },
        created() {
            this.confirmationCode = this.generateConfirmationCode();
        }
    }
</script>


<style>

</style>