package com.lalaina.api.utils;

import java.time.Duration;
import java.time.LocalDateTime;

public class DuracaoUtils {

    public static String calcularDuracao(LocalDateTime dataInicio, LocalDateTime dataFim){
        if (dataInicio == null || dataFim == null){
            return null;
        }
        Duration duration = Duration.between(dataInicio, dataFim);
        long dias = duration.toDays();
        long horas = duration.toHours();
        long minutos = duration.toMinutes();

        StringBuilder sb = new StringBuilder();

        if (dias > 0){
            sb.append(dias);
            sb.append("d ");
            horas = horas - (dias * 24);
            minutos = minutos - (dias * 24 * 60);
        }

        if (horas > 0){
            sb.append(horas);
            sb.append("h ");
            minutos = minutos - (horas * 60);
        }

        if (minutos > 0){
            sb.append(minutos);
            sb.append("m ");
        }

        return sb.substring(0, sb.length()-1);
    }

    public static LocalDateTime calcularDataFinal(LocalDateTime dataInicio, String duracao) {
//        if (dataInicio == null || StringUtils.isEmpty(duracao)){
//            return null;
//        }
//
//        Long minutosCorridos = minutosCorridos(duracao);
//
//        LocalDateTime dataFinal = dataInicio.plusMinutes(minutosCorridos);
//
//        System.out.println("Data Inicial = " + dataInicio);
//        System.out.println("Data Final = " + dataFinal);
//
//        return dataFinal;

        return LocalDateTime.now();
    }

    private static Long minutosCorridos(String duracao) {
        Long dias = recuperarValorDesejado(duracao, "d");
        Long horas = recuperarValorDesejado(duracao, "h");
        Long minutos = recuperarValorDesejado(duracao, "m");
        return (dias * 24 * 60) + (horas * 60) + (minutos);
    }

    private static Long recuperarValorDesejado(String duracao, String procurarPor) {
//        if (StringUtils.containsIgnoreCase(duracao, procurarPor)) {
//            String valor = duracao;
//
//            int index = StringUtils.indexOfAny(valor, procurarPor);
//            valor = StringUtils.substring(valor, index);
//
//            index = StringUtils.indexOf(valor, " ");
//            valor = StringUtils.substring(valor, index);
//
//            return Long.parseLong(valor);
//        }
        return 0L;
    }
}
