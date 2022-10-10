interface Numbers {

    fun sum(): Int
    fun sub(): Int

    class TwoNumbers(
        private val numberOne: Int, private val numberTwo: Int
    ) : Numbers {

        override fun sum(): Int {
            return numberOne + numberTwo
        }

        override fun sub(): Int {
            return numberOne - numberTwo
        }
    }

    class ThreeNumbers(
        private val numberOne: Int, private val numberTwo: Int, private val numberThree: Int
    ) : Numbers {

        override fun sum(): Int {
            return numberOne + numberTwo + numberThree
        }

        override fun sub(): Int {
            return numberOne - numberTwo - numberThree
        }
    }
}