import hudson.util.Secret

def call() {
    sh "echo Hello World!"
    def secret = Secret.fromString("your password")
    println(secret.getEncryptedValue())
}
