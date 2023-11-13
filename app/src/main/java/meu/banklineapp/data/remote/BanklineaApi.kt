package meu.banklineapp.data.remote

import meu.banklineapp.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineaApi {
    @GET("movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accountHolderId: Int): List<Movimentacao>
}