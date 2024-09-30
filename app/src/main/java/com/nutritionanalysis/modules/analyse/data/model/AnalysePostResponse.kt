package com.nutritionanalysis.modules.analyse.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

data class AnalysePostResponse(
    @SerializedName("calories")
    val calories: Int,
    @SerializedName("cautions")
    val cautions: List<Any>,
    @SerializedName("dietLabels")
    val dietLabels: List<String>,
    @SerializedName("healthLabels")
    val healthLabels: List<String>,
    @SerializedName("ingredients")
    val ingredients: List<Ingredient>,
    @SerializedName("totalDaily")
    val totalDaily: TotalDaily,
    @SerializedName("totalNutrients")
    val totalNutrients: TotalNutrients,
    @SerializedName("totalWeight")
    val totalWeight: Double,
    @SerializedName("uri")
    val uri: String,
    @SerializedName("yield")
    val yield: Double
)

@Parcelize
data class Ingredient(
    @SerializedName("parsed")
    val parsed: List<Parsed>,
    @SerializedName("text")
    val text: String
) : Parcelable

@Parcelize
data class Parsed(
    @SerializedName("food")
    val food: String,
    @SerializedName("foodId")
    val foodId: String,
    @SerializedName("foodMatch")
    val foodMatch: String,
    @SerializedName("measure")
    val measure: String,
    @SerializedName("measureURI")
    val measureURI: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("retainedWeight")
    val retainedWeight: Double,
    @SerializedName("status")
    val status: String,
    @SerializedName("weight")
    val weight: Double,
    @SerializedName("nutrients")
    val nutrients: Nutrients
) : Parcelable

@Parcelize
data class Nutrients(
    @SerializedName("ENERC_KCAL")
    val eNERCKCAL: ENERCKCAL

) : Parcelable {
    @IgnoredOnParcel
    @SerializedName("CA")
    val cA: CA? = null

    @IgnoredOnParcel
    @SerializedName("CHOCDF")
    val cHOCDF: CHOCDF? = null

    @IgnoredOnParcel
    @SerializedName("CHOLE")
    val cHOLE: CHOLE? = null

    @IgnoredOnParcel
    @SerializedName("FAMS")
    val fAMS: FAMS? = null

    @IgnoredOnParcel
    @SerializedName("FAPU")
    val fAPU: FAPU? = null

    @IgnoredOnParcel
    @SerializedName("FASAT")
    val fASAT: FASAT? = null

    @IgnoredOnParcel
    @SerializedName("FAT")
    val fAT: FAT? = null

    @IgnoredOnParcel
    @SerializedName("FE")
    val fE: FE? = null

    @IgnoredOnParcel
    @SerializedName("FIBTG")
    val fIBTG: FIBTG? = null

    @IgnoredOnParcel
    @SerializedName("FOLAC")
    val fOLAC: FOLAC? = null

    @IgnoredOnParcel
    @SerializedName("FOLDFE")
    val fOLDFE: FOLDFE? = null

    @IgnoredOnParcel
    @SerializedName("FOLFD")
    val fOLFD: FOLFD? = null

    @IgnoredOnParcel
    @SerializedName("K")
    val k: K? = null

    @IgnoredOnParcel
    @SerializedName("MG")
    val mG: MG? = null

    @IgnoredOnParcel
    @SerializedName("NA")
    val nA: NA? = null

    @IgnoredOnParcel
    @SerializedName("NIA")
    val nIA: NIA? = null

    @IgnoredOnParcel
    @SerializedName("P")
    val p: P? = null

    @IgnoredOnParcel
    @SerializedName("PROCNT")
    val pROCNT: PROCNT? = null

    @IgnoredOnParcel
    @SerializedName("RIBF")
    val rIBF: RIBF? = null

    @IgnoredOnParcel
    @SerializedName("SUGAR")
    val sUGAR: SUGAR? = null

    @IgnoredOnParcel
    @SerializedName("THIA")
    val tHIA: THIA? = null

    @IgnoredOnParcel
    @SerializedName("TOCPHA")
    val tOCPHA: TOCPHA? = null

    @IgnoredOnParcel
    @SerializedName("VITA_RAE")
    val vITARAE: VITARAE? = null

    @IgnoredOnParcel
    @SerializedName("VITB12")
    val vITB12: VITB12? = null

    @IgnoredOnParcel
    @SerializedName("VITB6A")
    val vITB6A: VITB6A? = null

    @IgnoredOnParcel
    @SerializedName("VITC")
    val vITC: VITC? = null

    @IgnoredOnParcel
    @SerializedName("VITD")
    val vITD: VITD? = null

    @IgnoredOnParcel
    @SerializedName("VITK1")
    val vITK1: VITK1? = null

    @IgnoredOnParcel
    @SerializedName("WATER")
    val wATER: WATER? = null

    @IgnoredOnParcel
    @SerializedName("ZN")
    val zN: ZN? = null
}

data class CA(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class CHOCDF(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class CHOLE(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

@Parcelize
data class ENERCKCAL(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
) : Parcelable

data class FAMS(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FAPU(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FASAT(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FAT(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FE(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FIBTG(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FOLAC(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FOLDFE(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class FOLFD(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class K(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class MG(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class NA(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class NIA(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class P(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class PROCNT(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class RIBF(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class SUGAR(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class THIA(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class TOCPHA(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class VITARAE(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class VITB12(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class VITB6A(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class VITC(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class VITD(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class VITK1(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class WATER(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)

data class ZN(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Double,
    @SerializedName("unit")
    val unit: String
)


data class TotalDaily(
    @SerializedName("CA")
    val cA: CA,
    @SerializedName("CHOCDF")
    val cHOCDF: CHOCDF,
    @SerializedName("CHOLE")
    val cHOLE: CHOLE,
    @SerializedName("ENERC_KCAL")
    val eNERCKCAL: ENERCKCAL,
    @SerializedName("FASAT")
    val fASAT: FASAT,
    @SerializedName("FAT")
    val fAT: FAT,
    @SerializedName("FE")
    val fE: FE,
    @SerializedName("FIBTG")
    val fIBTG: FIBTG,
    @SerializedName("FOLDFE")
    val fOLDFE: FOLDFE,
    @SerializedName("K")
    val k: K,
    @SerializedName("MG")
    val mG: MG,
    @SerializedName("NA")
    val nA: NA,
    @SerializedName("NIA")
    val nIA: NIA,
    @SerializedName("P")
    val p: P,
    @SerializedName("PROCNT")
    val pROCNT: PROCNT,
    @SerializedName("RIBF")
    val rIBF: RIBF,
    @SerializedName("THIA")
    val tHIA: THIA,
    @SerializedName("TOCPHA")
    val tOCPHA: TOCPHA,
    @SerializedName("VITA_RAE")
    val vITARAE: VITARAE,
    @SerializedName("VITB12")
    val vITB12: VITB12,
    @SerializedName("VITB6A")
    val vITB6A: VITB6A,
    @SerializedName("VITC")
    val vITC: VITC,
    @SerializedName("VITD")
    val vITD: VITD,
    @SerializedName("VITK1")
    val vITK1: VITK1,
    @SerializedName("ZN")
    val zN: ZN
) {
    data class CA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class CHOCDF(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class CHOLE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class ENERCKCAL(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FASAT(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FAT(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FIBTG(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FOLDFE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class K(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class MG(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class NA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class NIA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class P(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class PROCNT(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class RIBF(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class THIA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class TOCPHA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITARAE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITB12(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITB6A(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITC(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITD(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITK1(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class ZN(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )
}

data class TotalNutrients(
    @SerializedName("CA")
    val cA: CA,
    @SerializedName("CHOCDF")
    val cHOCDF: CHOCDF,
    @SerializedName("CHOLE")
    val cHOLE: CHOLE,
    @SerializedName("ENERC_KCAL")
    val eNERCKCAL: ENERCKCAL,
    @SerializedName("FAMS")
    val fAMS: FAMS,
    @SerializedName("FAPU")
    val fAPU: FAPU,
    @SerializedName("FASAT")
    val fASAT: FASAT,
    @SerializedName("FAT")
    val fAT: FAT,
    @SerializedName("FE")
    val fE: FE,
    @SerializedName("FIBTG")
    val fIBTG: FIBTG,
    @SerializedName("FOLAC")
    val fOLAC: FOLAC,
    @SerializedName("FOLDFE")
    val fOLDFE: FOLDFE,
    @SerializedName("FOLFD")
    val fOLFD: FOLFD,
    @SerializedName("K")
    val k: K,
    @SerializedName("MG")
    val mG: MG,
    @SerializedName("NA")
    val nA: NA,
    @SerializedName("NIA")
    val nIA: NIA,
    @SerializedName("P")
    val p: P,
    @SerializedName("PROCNT")
    val pROCNT: PROCNT,
    @SerializedName("RIBF")
    val rIBF: RIBF,
    @SerializedName("SUGAR")
    val sUGAR: SUGAR,
    @SerializedName("THIA")
    val tHIA: THIA,
    @SerializedName("TOCPHA")
    val tOCPHA: TOCPHA,
    @SerializedName("VITA_RAE")
    val vITARAE: VITARAE,
    @SerializedName("VITB12")
    val vITB12: VITB12,
    @SerializedName("VITB6A")
    val vITB6A: VITB6A,
    @SerializedName("VITC")
    val vITC: VITC,
    @SerializedName("VITD")
    val vITD: VITD,
    @SerializedName("VITK1")
    val vITK1: VITK1,
    @SerializedName("WATER")
    val wATER: WATER,
    @SerializedName("ZN")
    val zN: ZN
) {
    data class CA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class CHOCDF(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class CHOLE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class ENERCKCAL(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FAMS(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FAPU(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FASAT(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FAT(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FIBTG(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FOLAC(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FOLDFE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class FOLFD(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class K(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class MG(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class NA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class NIA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class P(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class PROCNT(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class RIBF(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class SUGAR(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class THIA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class TOCPHA(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITARAE(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITB12(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITB6A(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITC(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITD(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class VITK1(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class WATER(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )

    data class ZN(
        @SerializedName("label")
        val label: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("unit")
        val unit: String
    )
}
