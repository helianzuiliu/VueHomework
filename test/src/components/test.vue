<script>
export default {
  name: "test",

  setup() {
    const user = {
      name: "hlzl",
    }
    return {
      user
    }
  }
}
</script>

<template>
  Test <br>
  {{ user.name }}
</template>

<style scoped></style>