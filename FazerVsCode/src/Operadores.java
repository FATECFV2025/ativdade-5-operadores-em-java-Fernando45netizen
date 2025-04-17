public class Operadores {

    // Operadores Aritméticos
    public float adicao(float v1, float v2) { return v1 + v2; }
    public float subtracao(float v1, float v2) { return v1 - v2; }
    public float multiplicacao(float v1, float v2) { return v1 * v2; }
    public float divisao(float v1, float v2) { return v1 / v2; }

    // Operadores de Atribuição
    public float atribuicaoSoma(float valor, float incremento) {
        valor += incremento;
        return valor;
    }

    public float atribuicaoSubtracao(float valor, float decremento) {
        valor -= decremento;
        return valor;
    }

    public float atribuicaoMultiplicacao(float valor, float multiplicador) {
        valor *= multiplicador;
        return valor;
    }

    public float atribuicaoDivisao(float valor, float divisor) {
        if (divisor != 0) {
            valor /= divisor;
        }
        return valor;
    }

    // Operadores Lógicos
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean naoLogico(boolean a) {
        return !a;
    }

    // Operadores de Comparação
    public boolean igual(float v1, float v2) {
        return v1 == v2;
    }

    public boolean diferente(float v1, float v2) {
        return v1 != v2;
    }

    public boolean maiorQue(float v1, float v2) {
        return v1 > v2;
    }

    public boolean menorQue(float v1, float v2) {
        return v1 < v2;
    }

    public boolean maiorOuIgual(float v1, float v2) {
        return v1 >= v2;
    }

    public boolean menorOuIgual(float v1, float v2) {
        return v1 <= v2;
    }
}
