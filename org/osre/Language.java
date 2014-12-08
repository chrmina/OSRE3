package org.osre;

import org.osre.*;

public class Language {

    String[][] text = {{"Prefecture","“s“¹•{Œ§"},
		{"Hokkaido","–kŠC“¹"},
		{"Aomori","ÂX"},
		{"Iwate","Šâè"},
		{"Miyagi","‹{é"},
		{"Akita","H“c"},
		{"Yamagata","RŒ`"},
		{"Fukushima","•Ÿ“‡"},
		{"Ibaraki","ˆïé"},
		{"Tochigi","“È–Ø"},
		{"Gumma","ŒQ”n"},
		{"Saitama","é‹Ê"},
		{"Chiba","ç—t"},
		{"Tokyo","“Œ‹"},
		{"Kanagawa","_“Şì"},
		{"Yamanashi","R—œ"},
		{"Niigata","VŠƒ"},
		{"Nagano","’·–ì"},
		{"Shizuoka","Ã‰ª"},
		{"Aichi","ˆ¤’m"},
		{"Gifu","Šò•Œ"},
		{"Mie","Od"},
		{"Toyama","•xR"},
		{"Ishikawa","Îì"},
		{"Fukui","•Ÿˆä"},
		{"Shiga"," ‰ê"},
		{"Kyoto","‹“s"},
		{"Nara","“Ş—Ç"},
		{"Osaka","‘åã"},
		{"Wakayama","˜a‰ÌR"},
		{"Hyogo","•ºŒÉ"},
		{"Okayama","‰ªR"},
		{"Hiroshima","L“‡"},
		{"Tottori","’¹æ"},
		{"Shimane","“‡ª"},
		{"Yamaguchi","RŒû"},
		{"Kagawa","ì"},
		{"Tokushima","“¿“‡"},
		{"Ehime","ˆ¤•Q"},
		{"Kochi","‚’m"},
		{"Fukuoka","•Ÿ‰ª"},
		{"Saga","²‰ê"},
		{"Nagasaki","’·è"},
		{"Oita","‘å•ª"},
		{"Kumamoto","ŒF–{"},
		{"Miyazaki","‹{è"},
		{"Kagoshima","­™“‡"},
		{"Okinawa","‰«“ê"}};

    public String[] getLangText(int area) {
	String[] langText = new String[48];

	for(int i=0;i<48;i++) {
	    langText[i] = text[i][area-1];
	}

	return langText;
    }
}
