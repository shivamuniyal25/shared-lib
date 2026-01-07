def call() {
    echo "Step 1: Function called from vars directory"

    def helper = new helpers.MessageHelper()
    helper.showMessage()

    def configText = libraryResource 'app-config.txt'
    echo "Step 3: Config file content:"
    echo configText
}
