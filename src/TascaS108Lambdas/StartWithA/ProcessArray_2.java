package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessArray_2 {

    private static final Logger log = LoggerFactory.getLogger(ProcessArray.class);

    /*Reminder : No usar e.printStackTrace
     * 1.-Falta de Control sobre el Formato y Contenido de los Logs
     * 2.-No Integra con Sistemas de Logging
     * 3.-Problemas de Seguridad
     * 4.-Imposibilidad de Configurar Niveles de Severidad
     * */

    public int processArray1(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de límites.");
        }
        int valueIndex = array[index];
        log.info("Valor en el índice " + index + ": " + valueIndex);
        return valueIndex;
    }

    public int processArray2(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de límites.");
        }
        int valueIndex = array[index];
        log.info("Valor en el índice " + index + ": " + valueIndex);
        return valueIndex;
    }


    public int processArray3(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        int valueIndex = array[index];
        log.info("Valor en el índice " + index + ": " + valueIndex);
        return valueIndex;
    }

    public int processArray4(int[] array, int index) {
        int valueIndex = -1;
        try {
            valueIndex = array[index];
            log.info("Valor en el índice " + index + ": " + valueIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("ERROR: Índice fuera de límites. Asignando valor predeterminado.");
        }
        return valueIndex;
    }

    public int processArray5(int[] array, int index) {
        try {
            int valueIndex = array[index];
            log.info("Valor en el índice " + index + ": " + valueIndex);
            return valueIndex;
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("ERROR: Índice fuera de límites. Asignando valor predeterminado.");
            return 0;
        }
    }

    public int processArray6(int[] array, int index){
        try {
            if (index < 0 || index >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Índice fuera de límites.");
            }
            int valueIndex = array[index];
            log.info("Valor en el índice " + index + ": " + valueIndex);
            return valueIndex;
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("ERROR: Índice fuera de límites. No se puede acceder a ese índice.");
            return 0;
        }
    }

    public int processArray7(int[] array, int index) throws ArrayIndexOutOfBoundsException{
        try {
            int valueIndex = array[index];
            log.info("Valor en el índice " + index + ": " + valueIndex);
            return valueIndex;
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("ERROR: Intento de acceder a un índice fuera de límites. Índice solicitado: " + index + ". Longitud del array: " + array.length);
            throw new ArrayIndexOutOfBoundsException("Índice no válido: " + index + ". Longitud del array: " + array.length);
        }
    }

    public int processArray8(int[] array, int index){
        try {
            if (index < 0 || index >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Índice fuera de límites.");
            }
            int valueIndex = array[index];
            log.info("Valor en el índice " + index + ": " + valueIndex);
            return valueIndex;
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("ERROR: Índice fuera de límites. No se puede acceder a ese índice.");
            throw new ArrayIndexOutOfBoundsException("Índice no válido: " + index);
        }
    }

    public int processArray9(int[] array, int index) throws ArrayIndexOutOfBoundsException{
        try {
            if (index < 0 || index >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Índice fuera de límites.");
            }
            int valueIndex = array[index];
            log.info("Valor en el índice " + index + ": " + valueIndex);
            return valueIndex;
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("ERROR: Índice fuera de límites. No se puede acceder a ese índice.");
            throw new ArrayIndexOutOfBoundsException("Índice no válido: " + index);
        }
    }
}
