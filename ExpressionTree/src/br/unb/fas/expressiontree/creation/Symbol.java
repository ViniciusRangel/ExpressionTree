package br.unb.fas.expressiontree.creation;

import br.unb.fas.expressiontree.structure.ComponentNode;


/**
 * @class Symbol
 *
 * @brief Classe base para as v�rias subclasses de parse tree.
 */
abstract class Symbol
{
    /** 
     * As seguintes constantes definem o n�veis de preced�ncia para os v�rios operadores e operandos
     */

    /** Preced�ncia padr�o. */
    protected int precedence = 0;

    /** Left symbol. */
    protected Symbol left;

    /** Right symbol. */
    protected Symbol right;

    /** Ctor */
    public Symbol(Symbol left,
                  Symbol right,
                  int precedence)
    {
        this.precedence = precedence;
        this.left = left;
        this.right = right;
    }

    /** 
     * M�todo par retornar o n�vel de preced�ncia (valores maiores significam 
     * preced�ncia mais elevada
     */
    public int precedence()
    {
        return precedence;
    }

    /** M�todo abstrato para adicionar preced�ncia. */
    public abstract int addPrecedence(int accumulatedPrecedence);

    /** M�todo abstrato para construir um @a ComponentNode. */
    abstract ComponentNode build();
}

