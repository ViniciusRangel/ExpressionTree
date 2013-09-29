package br.unb.fas.expressiontree.creation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @class SymbolTable
 * 
 * @brief 	Esta classe armazena vari�veis e seus valores para uso pelo Interpreter.
 * 			Ela exerce o papel do "Context" no padr�o Interpreter
 */


public class SymbolTable
{
    /** Hash table containing variable names and values. */
    private HashMap<String, Integer> map =
        new HashMap<String, Integer>();

    /** Ctor */
    public SymbolTable()
    {
    }

    public int get(String variable)
    {
        /** Se uma vari�vel n�o estiver inicializada, o valor 0 � atribu�do a ela. */
        if(map.get(variable) != null)
            return map.get(variable);
        else
            {
                map.put(variable, 0);
                return map.get(variable);
            }
    }

    /** Atribui��o de valor a vari�vel. */
    public void set(String variable, int value)
    {
        map.put(variable, value);
    }

    /** 
     * Imprimir todas as vari�veis e seus valores para auxiliar o debug.
     */
    public void print()
    {
        for (Iterator<Entry<String, Integer>> it =
                 map.entrySet().iterator();
             it.hasNext();
             )
            {
                Entry<String,Integer> x = it.next();
                System.out.println((x.getKey()
                                                + " = "
                                                + x.getValue()));
            }
    }

    /** Limpar as vari�veis e seus valores. */
    public void reset()
    {
        map.clear();
    }
}
