def call() {
    for(int i=1; i<=4; i++){
        println i
    }

    for(a in 1..5){
        println a
    }

    1.step(6, 2) {
        println "$it"
    }
    
}