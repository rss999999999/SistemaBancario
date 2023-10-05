package br.com.rodrigo.banco;

public class ContaTest {

    private Conta conta;

    @BeforeEach
    public void setUp() {
        conta = new Conta(123, 456, 1000.0);
    }

    @Test
    public void testDepositarWhenValorIsPositiveThenBalanceIncreases() {
        // Arrange
        double valor = 500.0;

        // Act
        conta.depositar(valor);

        // Assert
        assertEquals(1500.0, conta.verificarSaldo(), "The balance should increase by the deposited amount");
    }

    @Test
    public void testDepositarWhenValorIsZeroThenBalanceRemainsSame() {
        // Arrange
        double valor = 0.0;

        // Act
        conta.depositar(valor);

        // Assert
        assertEquals(1000.0, conta.verificarSaldo(), "The balance should remain the same");
    }

    @Test
    public void testDepositarWhenValorIsNegativeThenBalanceRemainsSame() {
        // Arrange
        double valor = -500.0;

        // Act
        conta.depositar(valor);

        // Assert
        assertEquals(1000.0, conta.verificarSaldo(), "The balance should remain the same");
    }
}