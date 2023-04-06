 fun findYears(depo: Double): Int{
        var deposit = depo
        val interestRate = 1.071
        val max = 700000
        var years = depo.toInt() / depo.toInt()
        //
        // implement the while loop here
        while (deposit <= max) {
            deposit += (deposit * interestRate)
                years += 1
        }
        //
        return years
    }


