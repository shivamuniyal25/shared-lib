def call() {
    echo "Step 1: Function called from vars directory"

    def helper = new helpers.message()
    echo helper.showMessage()

    def configText = libraryResource 'config.txt'
    echo "Step 3: Config file content:"
    echo configText
}
