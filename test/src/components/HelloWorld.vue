<script>
import { ref } from "vue"

export default {
  // `setup` 是一个特殊的钩子，专门用于组合式 API。
  setup() {
    const count = ref(0)

    function Substract() {
      if (count.value > 0)
        count.value--
    }

    function Plus() {
      if (count.value < 10)
        count.value++
    }

    // 将 ref 暴露给模板
    return {
      count, Substract, Plus
    }
  }
}
</script>

<template>
  <div class="card">
    <label>count is {{ count }}</label>
    <p>
      <button type="button" @click="Substract">Substract</button>
      <button type="button" @click="Plus">Plus</button>
    </p>
    <p>
      Edit
      <code>components/HelloWorld.vue</code> to test HMR
    </p>
  </div>
</template>

<style scoped>
.read-the-docs {
  color: #888;
}
</style>
