package com.kata

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class CountingDuplicatesShould : DescribeSpec({
    /*
    *   Only string and numeric input values
    *   Return the number of repeated elements
     */

    describe("return the number of repeated"){
        it("in the word abbadc12"){
            val word = CountingDuplicates("abbadc12")

            val result = word.countDuplicate()

            result.shouldBe(2)
        }

        it("in the word indivisibility"){
            val word = CountingDuplicates("indivisibility")

            val result = word.countDuplicate()

            result.shouldBe(1)
        }

        it("in the word Indivisibilities"){
            val word = CountingDuplicates("Indivisibilities")

            val result = word.countDuplicate()

            result.shouldBe(2)
        }

        it("in the word aA11"){
            val word = CountingDuplicates("aA11")

            val result = word.countDuplicate()

            result.shouldBe(2)
        }

        it("in the word ABb4588lkkoopyy"){
            val word = CountingDuplicates("ABb4588lkkoopyy")

            val result = word.countDuplicate()

            result.shouldBe(5)
        }
    }

})