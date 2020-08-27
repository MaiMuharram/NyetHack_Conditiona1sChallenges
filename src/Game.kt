fun main(){
    var healthPoints = 100
    val playerName = "Madrigal"
    var isBlessed  = true
    var AuraDisplayed = false
    var AuraColor:String = ""
    val karma = (Math.pow(Math.random(),(110 - healthPoints) / 100.0) * 20).toInt()


    when(healthPoints){

        100 -> println("Madrigal is in excellent condition!")
        in 90..99 -> println("Madrigal has few scratches")
        in 75..89 -> {
            println("Madrigal has some minor wounds.")

            if(healthPoints==89) println("awful condition!")
            else {

                if (isBlessed)
                    println("Madrigal has some minor wounds but is healing quite quickly! ")
                else
                    println("Madrigal has few scratches")

            }
        }
        in 15..74 -> println("Madrigal looks pretty hurt.")
        in 0..14 -> println("Madrigal is in awful condition!")


    }


    when(karma){

        in 0..5 -> AuraColor = "red"
        in 6..10 -> AuraColor = "orange"
        in 11..15 -> AuraColor = "purple"
        in 16..20 -> AuraColor = "green"
    }

    println("PlayerName is $playerName")
    println("HealthPoints are : $healthPoints")
    println("The Aura Color now is $AuraColor " )

}