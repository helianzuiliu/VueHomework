module.exports = {
    dev: {
        proxyTable: {
            '/api': {
                target: 'https://localhost:4090',
                changeOrigin: true,
            },
        }
    }
}