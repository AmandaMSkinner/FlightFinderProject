<script setup>
    import { ref } from 'vue'

    const showMessage = ref(false);
    const message = ref('hello world!')
</script>

<template>
    <h2>Contact</h2>

    <label style="cursor: pointer">
        <input type="checkbox" v-model="showMessage" />
        Show Message
    </label>
    <input type="text" v-model="message" />

    <h2 v-if="showMessage">
        {{ message }}
    </h2>
</template>

<style scoped>

</style>
