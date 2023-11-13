package meu.banklineapp.ui.statement
import androidx.lifecycle.ViewModel
import meu.banklineapp.data.BanklineRepository


class BankStatementViewModel : ViewModel() {
    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}