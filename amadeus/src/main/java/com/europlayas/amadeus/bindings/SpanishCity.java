
package com.europlayas.amadeus.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpanishCity.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SpanishCity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEJE"/&gt;
 *     &lt;enumeration value="AGAETE"/&gt;
 *     &lt;enumeration value="AGUIMES"/&gt;
 *     &lt;enumeration value="AGULO"/&gt;
 *     &lt;enumeration value="ALAIOR"/&gt;
 *     &lt;enumeration value="ALAJERO"/&gt;
 *     &lt;enumeration value="ALARO"/&gt;
 *     &lt;enumeration value="ALCUDIA"/&gt;
 *     &lt;enumeration value="ALGAIDA"/&gt;
 *     &lt;enumeration value="ANDRAITSX"/&gt;
 *     &lt;enumeration value="ANTIGUA"/&gt;
 *     &lt;enumeration value="ARAFO"/&gt;
 *     &lt;enumeration value="ARIANY"/&gt;
 *     &lt;enumeration value="ARICO"/&gt;
 *     &lt;enumeration value="ARONA"/&gt;
 *     &lt;enumeration value="ARRECIFE"/&gt;
 *     &lt;enumeration value="ARTA"/&gt;
 *     &lt;enumeration value="ARTENARA"/&gt;
 *     &lt;enumeration value="ARUCAS"/&gt;
 *     &lt;enumeration value="BANALBUFAR"/&gt;
 *     &lt;enumeration value="BARLOVENTO"/&gt;
 *     &lt;enumeration value="BETANCURIA"/&gt;
 *     &lt;enumeration value="BINISALEM"/&gt;
 *     &lt;enumeration value="BRENA_ALTA"/&gt;
 *     &lt;enumeration value="BRENA_BAJA"/&gt;
 *     &lt;enumeration value="BUENAVISTA_DEL_NORTE"/&gt;
 *     &lt;enumeration value="BUGER"/&gt;
 *     &lt;enumeration value="BUNYOLA"/&gt;
 *     &lt;enumeration value="CALVIA"/&gt;
 *     &lt;enumeration value="CAMPANET"/&gt;
 *     &lt;enumeration value="CAMPOS"/&gt;
 *     &lt;enumeration value="CANDELARIA"/&gt;
 *     &lt;enumeration value="CAPDEPERA"/&gt;
 *     &lt;enumeration value="CEUTA"/&gt;
 *     &lt;enumeration value="CIUTADELLA_DE_MENORCA"/&gt;
 *     &lt;enumeration value="CONSELL"/&gt;
 *     &lt;enumeration value="COSTITX"/&gt;
 *     &lt;enumeration value="DEYA"/&gt;
 *     &lt;enumeration value="EIVISSA"/&gt;
 *     &lt;enumeration value="EL_PASO"/&gt;
 *     &lt;enumeration value="EL_PINAR"/&gt;
 *     &lt;enumeration value="EL_ROSARIO"/&gt;
 *     &lt;enumeration value="EL_SAUZAL"/&gt;
 *     &lt;enumeration value="EL_TANQUE"/&gt;
 *     &lt;enumeration value="ES_CASTELL"/&gt;
 *     &lt;enumeration value="ES_MERCADAL"/&gt;
 *     &lt;enumeration value="ES_MIGJORN_GRAN"/&gt;
 *     &lt;enumeration value="ESCORCA"/&gt;
 *     &lt;enumeration value="ESPORLES"/&gt;
 *     &lt;enumeration value="ESTELLENCHS"/&gt;
 *     &lt;enumeration value="FASNIA"/&gt;
 *     &lt;enumeration value="FELANITX"/&gt;
 *     &lt;enumeration value="FERRERIES"/&gt;
 *     &lt;enumeration value="FIRGAS"/&gt;
 *     &lt;enumeration value="FORMENTERA"/&gt;
 *     &lt;enumeration value="FORNALUTX"/&gt;
 *     &lt;enumeration value="FRONTERA"/&gt;
 *     &lt;enumeration value="FUENCALIENTE_DE_LA_PALMA"/&gt;
 *     &lt;enumeration value="GALDAR"/&gt;
 *     &lt;enumeration value="GARACHICO"/&gt;
 *     &lt;enumeration value="GARAFIA"/&gt;
 *     &lt;enumeration value="GRANADILLA_DE_ABONA"/&gt;
 *     &lt;enumeration value="GUIA_DE_ISORA"/&gt;
 *     &lt;enumeration value="GUIMAR"/&gt;
 *     &lt;enumeration value="HARIA"/&gt;
 *     &lt;enumeration value="HERMIGUA"/&gt;
 *     &lt;enumeration value="ICOD_DE_LOS_VINOS"/&gt;
 *     &lt;enumeration value="INCA"/&gt;
 *     &lt;enumeration value="INGENIO"/&gt;
 *     &lt;enumeration value="LA_GUANCHA"/&gt;
 *     &lt;enumeration value="LA_MATANZA_DE_ACENTEJO"/&gt;
 *     &lt;enumeration value="LA_OLIVA"/&gt;
 *     &lt;enumeration value="LA_OROTAVA"/&gt;
 *     &lt;enumeration value="LA_VICTORIA_DE_ACENTEJO"/&gt;
 *     &lt;enumeration value="LAS_PALMAS_DE_GRAN_CANARIA"/&gt;
 *     &lt;enumeration value="LLORET_DE_VISTA_ALEGRE"/&gt;
 *     &lt;enumeration value="LLOSETA"/&gt;
 *     &lt;enumeration value="LLUBI"/&gt;
 *     &lt;enumeration value="LLUCMAJOR"/&gt;
 *     &lt;enumeration value="LOS_LLANOS_DE_ARIDANE"/&gt;
 *     &lt;enumeration value="LOS_REALEJOS"/&gt;
 *     &lt;enumeration value="LOS_SILOS"/&gt;
 *     &lt;enumeration value="MAHON"/&gt;
 *     &lt;enumeration value="MANACOR"/&gt;
 *     &lt;enumeration value="MANCOR_DE_LA_VALL"/&gt;
 *     &lt;enumeration value="MARIA_DE_LA_SALUD"/&gt;
 *     &lt;enumeration value="MARRATXI"/&gt;
 *     &lt;enumeration value="MELILLA"/&gt;
 *     &lt;enumeration value="MOGAN"/&gt;
 *     &lt;enumeration value="MONTUIRI"/&gt;
 *     &lt;enumeration value="MOYA"/&gt;
 *     &lt;enumeration value="MURO"/&gt;
 *     &lt;enumeration value="PAJARA"/&gt;
 *     &lt;enumeration value="PALMA_DE_MALLORCA"/&gt;
 *     &lt;enumeration value="PETRA"/&gt;
 *     &lt;enumeration value="POLLENCA"/&gt;
 *     &lt;enumeration value="PORRERES"/&gt;
 *     &lt;enumeration value="PUERTO_DE_LA_CRUZ"/&gt;
 *     &lt;enumeration value="PUERTO_DEL_ROSARIO"/&gt;
 *     &lt;enumeration value="PUIGPUNYENT"/&gt;
 *     &lt;enumeration value="PUNTAGORDA"/&gt;
 *     &lt;enumeration value="PUNTALLANA"/&gt;
 *     &lt;enumeration value="SA_POBLA"/&gt;
 *     &lt;enumeration value="SAN_ANDRES_Y_SAUCES"/&gt;
 *     &lt;enumeration value="SAN_BARTOLOME"/&gt;
 *     &lt;enumeration value="SAN_BARTOLOME_DE_TIRAJANA"/&gt;
 *     &lt;enumeration value="SAN_CRISTOBAL_DE_LA_LAGUNA"/&gt;
 *     &lt;enumeration value="SAN_JUAN_DE_LA_RAMBLA"/&gt;
 *     &lt;enumeration value="SAN_MIGUEL_DE_ABONA"/&gt;
 *     &lt;enumeration value="SAN_NICOLAS_DE_TOLENTINO"/&gt;
 *     &lt;enumeration value="SAN_SEBASTIAN_DE_LA_GOMERA"/&gt;
 *     &lt;enumeration value="SANT_ANTONI_DE_PORTMANY"/&gt;
 *     &lt;enumeration value="SANT_JOAN"/&gt;
 *     &lt;enumeration value="SANT_JOAN_DE_LABRITJA"/&gt;
 *     &lt;enumeration value="SANT_JOSEP_DE_SA_TALAIA"/&gt;
 *     &lt;enumeration value="SANT_LLORENC_DES_CARDASSAR"/&gt;
 *     &lt;enumeration value="SANT_LLUIS"/&gt;
 *     &lt;enumeration value="SANTA_BRIGIDA"/&gt;
 *     &lt;enumeration value="SANTA_CRUZ_DE_LA_PALMA"/&gt;
 *     &lt;enumeration value="SANTA_CRUZ_DE_TENERIFE"/&gt;
 *     &lt;enumeration value="SANTA_EUGENIA"/&gt;
 *     &lt;enumeration value="SANTA_EULALIA_DEL_RIO"/&gt;
 *     &lt;enumeration value="SANTA_LUCIA_DE_TIRAJANA"/&gt;
 *     &lt;enumeration value="SANTA_MARGALIDA"/&gt;
 *     &lt;enumeration value="SANTA_MARIA_DE_GUIA_DE_GRAN_CANARIA"/&gt;
 *     &lt;enumeration value="SANTA_MARIA_DEL_CAMI"/&gt;
 *     &lt;enumeration value="SANTA_URSULA"/&gt;
 *     &lt;enumeration value="SANTANYI"/&gt;
 *     &lt;enumeration value="SANTIAGO_DEL_TEIDE"/&gt;
 *     &lt;enumeration value="SELVA"/&gt;
 *     &lt;enumeration value="SENCELLES"/&gt;
 *     &lt;enumeration value="SES_SALINES"/&gt;
 *     &lt;enumeration value="SINEU"/&gt;
 *     &lt;enumeration value="SOLLER"/&gt;
 *     &lt;enumeration value="SON_SERVERA"/&gt;
 *     &lt;enumeration value="TACORONTE"/&gt;
 *     &lt;enumeration value="TAZACORTE"/&gt;
 *     &lt;enumeration value="TEGUESTE"/&gt;
 *     &lt;enumeration value="TEGUISE"/&gt;
 *     &lt;enumeration value="TEJEDA"/&gt;
 *     &lt;enumeration value="TELDE"/&gt;
 *     &lt;enumeration value="TEROR"/&gt;
 *     &lt;enumeration value="TIAS"/&gt;
 *     &lt;enumeration value="TIJARAFE"/&gt;
 *     &lt;enumeration value="TINAJO"/&gt;
 *     &lt;enumeration value="TUINEJE"/&gt;
 *     &lt;enumeration value="VALLDEMOSA"/&gt;
 *     &lt;enumeration value="VALLE_GRAN_REY"/&gt;
 *     &lt;enumeration value="VALLEHERMOSO"/&gt;
 *     &lt;enumeration value="VALLESECO"/&gt;
 *     &lt;enumeration value="VALSEQUILLO_DE_GRAN_CANARIA"/&gt;
 *     &lt;enumeration value="VALVERDE"/&gt;
 *     &lt;enumeration value="VEGA_DE_SAN_MATEO"/&gt;
 *     &lt;enumeration value="VILAFLOR"/&gt;
 *     &lt;enumeration value="VILAFRANCA_DE_BONANY"/&gt;
 *     &lt;enumeration value="VILLA_DE_MAZO"/&gt;
 *     &lt;enumeration value="YAIZA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpanishCity")
@XmlEnum
public enum SpanishCity {

    ADEJE,
    AGAETE,
    AGUIMES,
    AGULO,
    ALAIOR,
    ALAJERO,
    ALARO,
    ALCUDIA,
    ALGAIDA,
    ANDRAITSX,
    ANTIGUA,
    ARAFO,
    ARIANY,
    ARICO,
    ARONA,
    ARRECIFE,
    ARTA,
    ARTENARA,
    ARUCAS,
    BANALBUFAR,
    BARLOVENTO,
    BETANCURIA,
    BINISALEM,
    BRENA_ALTA,
    BRENA_BAJA,
    BUENAVISTA_DEL_NORTE,
    BUGER,
    BUNYOLA,
    CALVIA,
    CAMPANET,
    CAMPOS,
    CANDELARIA,
    CAPDEPERA,
    CEUTA,
    CIUTADELLA_DE_MENORCA,
    CONSELL,
    COSTITX,
    DEYA,
    EIVISSA,
    EL_PASO,
    EL_PINAR,
    EL_ROSARIO,
    EL_SAUZAL,
    EL_TANQUE,
    ES_CASTELL,
    ES_MERCADAL,
    ES_MIGJORN_GRAN,
    ESCORCA,
    ESPORLES,
    ESTELLENCHS,
    FASNIA,
    FELANITX,
    FERRERIES,
    FIRGAS,
    FORMENTERA,
    FORNALUTX,
    FRONTERA,
    FUENCALIENTE_DE_LA_PALMA,
    GALDAR,
    GARACHICO,
    GARAFIA,
    GRANADILLA_DE_ABONA,
    GUIA_DE_ISORA,
    GUIMAR,
    HARIA,
    HERMIGUA,
    ICOD_DE_LOS_VINOS,
    INCA,
    INGENIO,
    LA_GUANCHA,
    LA_MATANZA_DE_ACENTEJO,
    LA_OLIVA,
    LA_OROTAVA,
    LA_VICTORIA_DE_ACENTEJO,
    LAS_PALMAS_DE_GRAN_CANARIA,
    LLORET_DE_VISTA_ALEGRE,
    LLOSETA,
    LLUBI,
    LLUCMAJOR,
    LOS_LLANOS_DE_ARIDANE,
    LOS_REALEJOS,
    LOS_SILOS,
    MAHON,
    MANACOR,
    MANCOR_DE_LA_VALL,
    MARIA_DE_LA_SALUD,
    MARRATXI,
    MELILLA,
    MOGAN,
    MONTUIRI,
    MOYA,
    MURO,
    PAJARA,
    PALMA_DE_MALLORCA,
    PETRA,
    POLLENCA,
    PORRERES,
    PUERTO_DE_LA_CRUZ,
    PUERTO_DEL_ROSARIO,
    PUIGPUNYENT,
    PUNTAGORDA,
    PUNTALLANA,
    SA_POBLA,
    SAN_ANDRES_Y_SAUCES,
    SAN_BARTOLOME,
    SAN_BARTOLOME_DE_TIRAJANA,
    SAN_CRISTOBAL_DE_LA_LAGUNA,
    SAN_JUAN_DE_LA_RAMBLA,
    SAN_MIGUEL_DE_ABONA,
    SAN_NICOLAS_DE_TOLENTINO,
    SAN_SEBASTIAN_DE_LA_GOMERA,
    SANT_ANTONI_DE_PORTMANY,
    SANT_JOAN,
    SANT_JOAN_DE_LABRITJA,
    SANT_JOSEP_DE_SA_TALAIA,
    SANT_LLORENC_DES_CARDASSAR,
    SANT_LLUIS,
    SANTA_BRIGIDA,
    SANTA_CRUZ_DE_LA_PALMA,
    SANTA_CRUZ_DE_TENERIFE,
    SANTA_EUGENIA,
    SANTA_EULALIA_DEL_RIO,
    SANTA_LUCIA_DE_TIRAJANA,
    SANTA_MARGALIDA,
    SANTA_MARIA_DE_GUIA_DE_GRAN_CANARIA,
    SANTA_MARIA_DEL_CAMI,
    SANTA_URSULA,
    SANTANYI,
    SANTIAGO_DEL_TEIDE,
    SELVA,
    SENCELLES,
    SES_SALINES,
    SINEU,
    SOLLER,
    SON_SERVERA,
    TACORONTE,
    TAZACORTE,
    TEGUESTE,
    TEGUISE,
    TEJEDA,
    TELDE,
    TEROR,
    TIAS,
    TIJARAFE,
    TINAJO,
    TUINEJE,
    VALLDEMOSA,
    VALLE_GRAN_REY,
    VALLEHERMOSO,
    VALLESECO,
    VALSEQUILLO_DE_GRAN_CANARIA,
    VALVERDE,
    VEGA_DE_SAN_MATEO,
    VILAFLOR,
    VILAFRANCA_DE_BONANY,
    VILLA_DE_MAZO,
    YAIZA;

    public String value() {
        return name();
    }

    public static SpanishCity fromValue(String v) {
        return valueOf(v);
    }

}
