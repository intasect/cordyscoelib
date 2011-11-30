/**
 * (c) 2009 Cordys R&D B.V. All rights reserved. The computer program(s) is the
 * proprietary information of Cordys B.V. and provided under the relevant
 * License Agreement containing restrictions on use and disclosure. Use is
 * subject to the License Agreement.
 */
package com.cordys.coe.util;

/**
 * Immutable object which contains four typed object references. This can be safely used as a map
 * key.
 *
 * @param   <T1>  First reference type.
 * @param   <T2>  Second reference type.
 * @param   <T3>  Third reference type.
 * @param   <T4>  Fourth reference type.
 *
 * @author  mpoyhone
 */
public class Tuple4<T1, T2, T3, T4> extends Tuple3<T1, T2, T3>
{
    /**
     * Contains the fourth value.
     */
    protected final T4 value4;

    /**
     * Constructor for Tuple4.
     *
     * @param  value1  first value.
     * @param  value2  second value.
     * @param  value3  third value.
     * @param  value4  fourth value.
     */
    public Tuple4(T1 value1, T2 value2, T3 value3, T4 value4)
    {
        super(value1, value2, value3);
        this.value4 = value4;
    }

    /**
     * @see  java.lang.Object#equals(java.lang.Object)
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (!super.equals(obj))
        {
            return false;
        }

        if (getClass() != obj.getClass())
        {
            return false;
        }

        Tuple4<T1, T2, T3, T4> other = (Tuple4<T1, T2, T3, T4>) obj;

        return safeEquals(value4, other.value4);
    }

    /**
     * Returns the value4.
     *
     * @return  Returns the value4.
     */
    public T4 getValue4()
    {
        return value4;
    }

    /**
     * @see  java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = (prime * result) + safeHashcode(value4);
        return result;
    }

    /**
     * @see  java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return String.format("Tuple4 [value1=%s, value2=%s, value3=%s, value4=%s]", value1, value2,
                             value3, value4);
    }
}
