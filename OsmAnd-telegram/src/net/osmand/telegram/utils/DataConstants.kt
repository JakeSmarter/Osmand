package net.osmand.telegram.utils

object DataConstants {

	const val UTC_FORMAT = "UTC"

	val countryPhoneCodes = mapOf("AB" to "+7840,+7940,+99544", "AF" to "+93", "AX" to "+35818",
		"AL" to "+355","DZ" to "+213", "AS" to "+1684", "AD" to "+376", "AO" to "+244","AI" to "+1264",
		"AG" to "+1268", "AR" to "+54", "AM" to "+374","AW" to "+297", "SH" to "+247", "AU" to "+61",
		"AU" to "+672","AT" to "+43", "AZ" to "+994", "BS" to "+1242", "BH" to "+973","BD" to "+880",
		"BB" to "+1246", "AG" to "+1268", "BY" to "+375","BE" to "+32", "BZ" to "+501", "BJ" to "+229",
		"BM" to "+1441","BT" to "+975", "BO" to "+591", "BQ" to "+5997", "BA" to "+387","BW" to "+267",
		"BR" to "+55", "IO" to "+246", "VG" to "+1284","BN" to "+673", "BG" to "+359", "BF" to "+226",
		"MY" to "+95","BI" to "+257", "KH" to "+855", "CM" to "+237", "CA" to "+1","CV" to "+238",
		"KY" to "+1345", "CF" to "+236", "TD" to "+235","CL" to "+56", "CN" to "+86", "CX" to "+61",
		"CC" to "+61","CO" to "+57", "KM" to "+269", "CG" to "+242", "CD" to "+243","CK" to "+682",
		"CR" to "+506", "CI" to "+225", "HR" to "+385","CU" to "+53", "CW" to "+5999", "CY" to "+357",
		"CZ" to "+420","DK" to "+45", "DG" to "+246", "DJ" to "+253", "DM" to "+1767","DO" to "+1809,+1829,+1849",
		"TL" to "+670", "EC" to "+593","EG" to "+20", "SV" to "+503", "GQ" to "+240", "ER" to "+291",
		"EE" to "+372", "ET" to "+251", "FK" to "+500", "FO" to "+298","FJ" to "+679", "FI" to "+358",
		"FR" to "+33", "GF" to "+594","PF" to "+689", "GA" to "+241", "GM" to "+220", "GE" to "+995",
		"DE" to "+49", "GH" to "+233", "GI" to "+350", "GR" to "+30","GL" to "+299", "GD" to "+1473",
		"GP" to "+590", "GU" to "+1671","GT" to "+502", "GG" to "+44", "GN" to "+224", "GW" to "+245",
		"GY" to "+592", "HT" to "+509", "HN" to "+504", "HK" to "+852","HU" to "+36", "IS" to "+354",
		"IN" to "+91", "ID" to "+62","IR" to "+98", "IQ" to "+964", "IE" to "+353", "IL" to "+972",
		"IT" to "+39", "JM" to "+1876", "SJ" to "+4779", "JP" to "+81","JE" to "+44", "JO" to "+962",
		"KZ" to "+76,+77", "KE" to "+254","KI" to "+686", "KP" to "+850", "KR" to "+82", "KW" to "+965",
		"KG" to "+996", "LA" to "+856", "LV" to "+371", "LB" to "+961","LS" to "+266", "LR" to "+231",
		"LY" to "+218", "LI" to "+423","LT" to "+370", "LU" to "+352", "MO" to "+853", "MK" to "+389",
		"MG" to "+261", "MW" to "+265", "MY" to "+60", "MV" to "+960","ML" to "+223", "MT" to "+356",
		"MH" to "+692", "MQ" to "+596","MR" to "+222", "MU" to "+230", "YT" to "+262", "MX" to "+52",
		"FM" to "+691", "MD" to "+373", "MC" to "+377", "MN" to "+976","ME" to "+382", "MS" to "+1664",
		"MA" to "+212", "MZ" to "+258","NA" to "+264", "NR" to "+674", "NP" to "+977", "NL" to "+31",
		"NC" to "+687", "NZ" to "+64", "NI" to "+505", "NE" to "+227","NG" to "+234", "NU" to "+683",
		"NF" to "+672", "MP" to "+1670","NO" to "+47", "OM" to "+968", "PK" to "+92", "PW" to "+680",
		"PS" to "+970", "PA" to "+507", "PG" to "+675", "PY" to "+595","PE" to "+51", "PH" to "+63",
		"PN" to "+64", "PL" to "+48","PT" to "+351", "PR" to "+1787,+1939", "QA" to "+974", "RE" to "+262",
		"RO" to "+40", "RU" to "+7", "RW" to "+250", "BL" to "+590","SH" to "+290", "KN" to "+1869",
		"LC" to "+1758", "MF" to "+590","PM" to "+508", "VC" to "+1784", "WS" to "+685", "SM" to "+378",
		"ST" to "+239", "SA" to "+966", "SN" to "+221", "RS" to "+381","SC" to "+248", "SL" to "+232",
		"SG" to "+65", "BQ" to "+5993","SX" to "+1721", "SK" to "+421", "SI" to "+386", "SB" to "+677",
		"SO" to "+252", "ZA" to "+27", "GS" to "+500", "!1" to "+99534","SS" to "+211", "ES" to "+34",
		"LK" to "+94", "SD" to "+249","SR" to "+597", "SJ" to "+4779", "SZ" to "+268", "SE" to "+46",
		"CH" to "+41", "SY" to "+963", "TW" to "+886", "TJ" to "+992","TZ" to "+255", "TH" to "+66",
		"TG" to "+228", "TK" to "+690","TO" to "+676", "TT" to "+1868", "TN" to "+216", "TR" to "+90",
		"TM" to "+993", "TC" to "+1649", "TV" to "+688", "UG" to "+256","UA" to "+380", "AE" to "+971",
		"UK" to "+44", "US" to "+1","UY" to "+598", "VI" to "+1340", "UZ" to "+998", "VU" to "+678", "VE" to "+58",
		"VA" to "+3906698,+379", "VN" to "+84", "WF" to "+681","YE" to "+967", "ZM" to "+260", "ZW" to "+263")

	val utcOffsets = listOf(
		"$UTC_FORMAT−12",
		"$UTC_FORMAT−11",
		"$UTC_FORMAT−10",
		"$UTC_FORMAT−09:30",
		"$UTC_FORMAT−9",
		"$UTC_FORMAT−8",
		"$UTC_FORMAT−7",
		"$UTC_FORMAT−6",
		"$UTC_FORMAT−5",
		"$UTC_FORMAT−4",
		"$UTC_FORMAT−03:30",
		"$UTC_FORMAT−3",
		"$UTC_FORMAT−2",
		"$UTC_FORMAT−1",
		  UTC_FORMAT,
		"$UTC_FORMAT+1",
		"$UTC_FORMAT+2",
		"$UTC_FORMAT+3",
		"$UTC_FORMAT+03:30",
		"$UTC_FORMAT+4",
		"$UTC_FORMAT+04:30",
		"$UTC_FORMAT+5",
		"$UTC_FORMAT+05:30",
		"$UTC_FORMAT+05:45",
		"$UTC_FORMAT+6",
		"$UTC_FORMAT+06:30",
		"$UTC_FORMAT+7",
		"$UTC_FORMAT+8",
		"$UTC_FORMAT+08:45",
		"$UTC_FORMAT+9",
		"$UTC_FORMAT+09:30",
		"$UTC_FORMAT+10",
		"$UTC_FORMAT+10:30",
		"$UTC_FORMAT+11",
		"$UTC_FORMAT+12",
		"$UTC_FORMAT+12:45",
		"$UTC_FORMAT+13",
		"$UTC_FORMAT+13:45",
		"$UTC_FORMAT+14"
	)
}