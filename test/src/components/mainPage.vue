<script>
export default {
  name: "mainPage",

  setup() {
    const user = { name: "hlzl" }
    return {
      user
    }
  }
}
</script>

<template>
  Welcome! {{ user.name }}
</template>


<style scoped></style>