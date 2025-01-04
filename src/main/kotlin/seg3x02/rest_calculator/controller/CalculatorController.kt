package seg3x02.rest_calculator.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("calculator")
class CalculatorController {
    @GetMapping("/sum/{firstNumber}/{secondNumber}")
    fun getAddition(@PathVariable firstNumber: Double, @PathVariable secondNumber: Double) = firstNumber + secondNumber

    @GetMapping("/difference/{firstNumber}/{secondNumber}")
    fun getSoustraction(@PathVariable firstNumber: Double, @PathVariable secondNumber: Double) = firstNumber - secondNumber

    @GetMapping("/multiplication/{firstNumber}/{secondNumber}")
    fun getMultiplication(@PathVariable firstNumber: Double, @PathVariable secondNumber: Double) = firstNumber * secondNumber

    @GetMapping("/division/{firstNumber}/{secondNumber}")
    fun getDivision(@PathVariable firstNumber: Double, @PathVariable secondNumber: Double) = firstNumber / secondNumber
}