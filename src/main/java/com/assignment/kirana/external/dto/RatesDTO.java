package com.assignment.kirana.external.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record RatesDTO(
        @JsonProperty("ADA")
        Double ada,
        @JsonProperty("AED")
        Double aed,
        @JsonProperty("AFN")
        Double afn,
        @JsonProperty("ALL")
        Double all,
        @JsonProperty("AMD")
        Double amd,
        @JsonProperty("ANG")
        Double ang,
        @JsonProperty("AOA")
        Double aoa,
        @JsonProperty("ARB")
        Double arb,
        @JsonProperty("ARS")
        Double ars,
        @JsonProperty("AUD")
        Double aud,
        @JsonProperty("AWG")
        Double awg,
        @JsonProperty("AZN")
        Double azn,
        @JsonProperty("BAM")
        Double bam,
        @JsonProperty("BBD")
        Integer bbd,
        @JsonProperty("BDT")
        Double bdt,
        @JsonProperty("BGN")
        Double bgn,
        @JsonProperty("BHD")
        Double bhd,
        @JsonProperty("BIF")
        Double bif,
        @JsonProperty("BMD")
        Integer bmd,
        @JsonProperty("BNB")
        Double bnb,
        @JsonProperty("BND")
        Double bnd,
        @JsonProperty("BOB")
        Double bob,
        @JsonProperty("BRL")
        Double brl,
        @JsonProperty("BSD")
        Integer bsd,
        @JsonProperty("BTC")
        Double btc,
        @JsonProperty("BTN")
        Double btn,
        @JsonProperty("BWP")
        Double bwp,
        @JsonProperty("BYN")
        Double byn,
        @JsonProperty("BYR")
        Double byr,
        @JsonProperty("BZD")
        Integer bzd,
        @JsonProperty("CAD")
        Double cad,
        @JsonProperty("CDF")
        Double cdf,
        @JsonProperty("CHF")
        Double chf,
        @JsonProperty("CLF")
        Double clf,
        @JsonProperty("CLP")
        Double clp,
        @JsonProperty("CNY")
        Double cny,
        @JsonProperty("COP")
        Double cop,
        @JsonProperty("CRC")
        Double crc,
        @JsonProperty("CUC")
        Integer cuc,
        @JsonProperty("CUP")
        Integer cup,
        @JsonProperty("CVE")
        Double cve,
        @JsonProperty("CZK")
        Double czk,
        @JsonProperty("DAI")
        Double dai,
        @JsonProperty("DJF")
        Double djf,
        @JsonProperty("DKK")
        Double dkk,
        @JsonProperty("DOP")
        Double dop,
        @JsonProperty("DOT")
        Double dot,
        @JsonProperty("DZD")
        Double dzd,
        @JsonProperty("EGP")
        Double egp,
        @JsonProperty("ERN")
        Integer ern,
        @JsonProperty("ETB")
        Double etb,
        @JsonProperty("ETH")
        Double eth,
        @JsonProperty("EUR")
        Double eur,
        @JsonProperty("FJD")
        Double fjd,
        @JsonProperty("FKP")
        Double fkp,
        @JsonProperty("GBP")
        Double gbp,
        @JsonProperty("GEL")
        Double gel,
        @JsonProperty("GGP")
        Double ggp,
        @JsonProperty("GHS")
        Double ghs,
        @JsonProperty("GIP")
        Double gip,
        @JsonProperty("GMD")
        Double gmd,
        @JsonProperty("GNF")
        Double gnf,
        @JsonProperty("GTQ")
        Double gtq,
        @JsonProperty("GYD")
        Double gyd,
        @JsonProperty("HKD")
        Double hkd,
        @JsonProperty("HNL")
        Double hnl,
        @JsonProperty("HRK")
        Double hrk,
        @JsonProperty("HTG")
        Double htg,
        @JsonProperty("HUF")
        Double huf,
        @JsonProperty("IDR")
        Double idr,
        @JsonProperty("ILS")
        Double ils,
        @JsonProperty("IMP")
        Double imp,
        @JsonProperty("INR")
        Double inr,
        @JsonProperty("IQD")
        Double iqd,
        @JsonProperty("IRR")
        Double irr,
        @JsonProperty("ISK")
        Double isk,
        @JsonProperty("JEP")
        Double jep,
        @JsonProperty("JMD")
        Double jmd,
        @JsonProperty("JOD")
        Double jod,
        @JsonProperty("JPY")
        Double jpy,
        @JsonProperty("KES")
        Double kes,
        @JsonProperty("KGS")
        Double kgs,
        @JsonProperty("KHR")
        Double khr,
        @JsonProperty("KMF")
        Double kmf,
        @JsonProperty("KPW")
        Double kpw,
        @JsonProperty("KRW")
        Double krw,
        @JsonProperty("KWD")
        Double kwd,
        @JsonProperty("KYD")
        Double kyd,
        @JsonProperty("KZT")
        Double kzt,
        @JsonProperty("LAK")
        Double lak,
        @JsonProperty("LBP")
        Double lbp,
        @JsonProperty("LKR")
        Double lkr,
        @JsonProperty("LRD")
        Double lrd,
        @JsonProperty("LSL")
        Double lsl,
        @JsonProperty("LTC")
        Double ltc,
        @JsonProperty("LTL")
        Double ltl,
        @JsonProperty("LVL")
        Double lvl,
        @JsonProperty("LYD")
        Double lyd,
        @JsonProperty("MAD")
        Double mad,
        @JsonProperty("MDL")
        Double mdl,
        @JsonProperty("MGA")
        Double mga,
        @JsonProperty("MKD")
        Double mkd,
        @JsonProperty("MMK")
        Double mmk,
        @JsonProperty("MNT")
        Double mnt,
        @JsonProperty("MOP")
        Double mop,
        @JsonProperty("MRO")
        Double mro,
        @JsonProperty("MUR")
        Double mur,
        @JsonProperty("MVR")
        Double mvr,
        @JsonProperty("MWK")
        Double mwk,
        @JsonProperty("MXN")
        Double mxn,
        @JsonProperty("MYR")
        Double myr,
        @JsonProperty("MZN")
        Double mzn,
        @JsonProperty("NAD")
        Double nad,
        @JsonProperty("NGN")
        Double ngn,
        @JsonProperty("NIO")
        Double nio,
        @JsonProperty("NOK")
        Double nok,
        @JsonProperty("NPR")
        Double npr,
        @JsonProperty("NZD")
        Double nzd,
        @JsonProperty("OMR")
        Double omr,
        @JsonProperty("OP")
        Double op,
        @JsonProperty("PAB")
        Double pab,
        @JsonProperty("PEN")
        Double pen,
        @JsonProperty("PGK")
        Double pgk,
        @JsonProperty("PHP")
        Double php,
        @JsonProperty("PKR")
        Double pkr,
        @JsonProperty("PLN")
        Double pln,
        @JsonProperty("PYG")
        Double pyg,
        @JsonProperty("QAR")
        Double qar,
        @JsonProperty("RON")
        Double ron,
        @JsonProperty("RSD")
        Double rsd,
        @JsonProperty("RUB")
        Double rub,
        @JsonProperty("RWF")
        Double rwf,
        @JsonProperty("SAR")
        Double sar,
        @JsonProperty("SBD")
        Double sbd,
        @JsonProperty("SCR")
        Double scr,
        @JsonProperty("SDG")
        Double sdg,
        @JsonProperty("SEK")
        Double sek,
        @JsonProperty("SGD")
        Double sgd,
        @JsonProperty("SHP")
        Double shp,
        @JsonProperty("SLL")
        Double sll,
        @JsonProperty("SOL")
        Double sol,
        @JsonProperty("SOS")
        Double sos,
        @JsonProperty("SRD")
        Double srd,
        @JsonProperty("STD")
        Double std,
        @JsonProperty("SVC")
        Double svc,
        @JsonProperty("SYP")
        Double syp,
        @JsonProperty("SZL")
        Double szl,
        @JsonProperty("THB")
        Double thb,
        @JsonProperty("TJS")
        Double tjs,
        @JsonProperty("TMT")
        Double tmt,
        @JsonProperty("TND")
        Double tnd,
        @JsonProperty("TOP")
        Double top,
        @JsonProperty("TRY")
        Double _try,
        @JsonProperty("TTD")
        Double ttd,
        @JsonProperty("TWD")
        Double twd,
        @JsonProperty("TZS")
        Double tzs,
        @JsonProperty("UAH")
        Double uah,
        @JsonProperty("UGX")
        Double ugx,
        @JsonProperty("USD")
        Integer usd,
        @JsonProperty("UYU")
        Double uyu,
        @JsonProperty("UZS")
        Double uzs,
        @JsonProperty("VEF")
        Double vef,
        @JsonProperty("VND")
        Double vnd,
        @JsonProperty("VUV")
        Double vuv,
        @JsonProperty("WST")
        Double wst,
        @JsonProperty("XAF")
        Double xaf,
        @JsonProperty("XAG")
        Double xag,
        @JsonProperty("XAU")
        Double xau,
        @JsonProperty("XCD")
        Double xcd,
        @JsonProperty("XDR")
        Double xdr,
        @JsonProperty("XOF")
        Double xof,
        @JsonProperty("XPD")
        Double xpd,
        @JsonProperty("XPF")
        Double xpf,
        @JsonProperty("XPT")
        Double xpt,
        @JsonProperty("XRP")
        Double xrp,
        @JsonProperty("YER")
        Double yer,
        @JsonProperty("ZAR")
        Double zar,
        @JsonProperty("ZMK")
        Double zmk,
        @JsonProperty("ZMW")
        Double zmw,
        @JsonProperty("ZWL")
        Double zwl
) {
}
