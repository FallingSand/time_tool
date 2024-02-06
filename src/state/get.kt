package state

import java.util.Calendar

fun getTime():Map<State.DataType, Int> {
    val time = Calendar.getInstance()
    val sec = time.get(Calendar.SECOND)
    val min = time.get(Calendar.MINUTE)
    val hou = time.get(Calendar.HOUR)
    val houDay = time.get(Calendar.HOUR_OF_DAY)
    val dayWee = time.get(Calendar.DAY_OF_WEEK)
    val dayWeeMon = time.get(Calendar.DAY_OF_WEEK_IN_MONTH)
    val dayMon = time.get(Calendar.DAY_OF_MONTH)
    val dayYea = time.get(Calendar.DAY_OF_YEAR)
    val weeMon = time.get(Calendar.WEEK_OF_MONTH)
    val weeYea = time.get(Calendar.WEEK_OF_YEAR)
    val mon = time.get(Calendar.MONTH) + 1
    val yea = time.get(Calendar.YEAR)
    return mapOf(
        State.DataType.Sec to sec,
        State.DataType.Min to min,
        State.DataType.Hou to hou,
        State.DataType.HouDay to houDay,
        State.DataType.DayWee to dayWee,
        State.DataType.DayWeeMon to dayWeeMon,
        State.DataType.DayMon to dayMon,
        State.DataType.DayYea to dayYea,
        State.DataType.WeeMon to weeMon,
        State.DataType.WeeYea to weeYea,
        State.DataType.Mon to mon,
        State.DataType.Yea to yea
    )
}