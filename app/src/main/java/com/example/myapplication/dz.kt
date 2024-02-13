fun main() {
    var financialInvestments = listOf(
        FinancialInvestment("123", "Расходный", 100.0),
        FinancialInvestment("321", "Доходный", 242.1),
        FinancialInvestment("452", "Инвестиционный", 87.4),
        FinancialInvestment("452", "Инвестиционный", 12.6),
        FinancialInvestment("124", "Расходный", 121.4),
    )
    val groopbyOperations = financialInvestments.groupBy { it.AccountType }
    for((type, operations) in groopbyOperations){
//        val totalAmount = operations.sumByDouble { it.amount }
        println("Тип счёта:  $type  Суммарный:  $operations")
    }}
data class FinancialInvestment(val AccountNumber: String, val AccountType: String, val amount: Double)