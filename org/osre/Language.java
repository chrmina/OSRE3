package org.osre;

import org.osre.*;

public class Language {

    String[][] text = {{"Prefecture","�s���{��"},
		{"Hokkaido","�k�C��"},
		{"Aomori","�X"},
		{"Iwate","���"},
		{"Miyagi","�{��"},
		{"Akita","�H�c"},
		{"Yamagata","�R�`"},
		{"Fukushima","����"},
		{"Ibaraki","���"},
		{"Tochigi","�Ȗ�"},
		{"Gumma","�Q�n"},
		{"Saitama","���"},
		{"Chiba","��t"},
		{"Tokyo","����"},
		{"Kanagawa","�_�ސ�"},
		{"Yamanashi","�R��"},
		{"Niigata","�V��"},
		{"Nagano","����"},
		{"Shizuoka","�É�"},
		{"Aichi","���m"},
		{"Gifu","��"},
		{"Mie","�O�d"},
		{"Toyama","�x�R"},
		{"Ishikawa","�ΐ�"},
		{"Fukui","����"},
		{"Shiga","����"},
		{"Kyoto","���s"},
		{"Nara","�ޗ�"},
		{"Osaka","���"},
		{"Wakayama","�a�̎R"},
		{"Hyogo","����"},
		{"Okayama","���R"},
		{"Hiroshima","�L��"},
		{"Tottori","����"},
		{"Shimane","����"},
		{"Yamaguchi","�R��"},
		{"Kagawa","����"},
		{"Tokushima","����"},
		{"Ehime","���Q"},
		{"Kochi","���m"},
		{"Fukuoka","����"},
		{"Saga","����"},
		{"Nagasaki","����"},
		{"Oita","�啪"},
		{"Kumamoto","�F�{"},
		{"Miyazaki","�{��"},
		{"Kagoshima","������"},
		{"Okinawa","����"}};

    public String[] getLangText(int area) {
	String[] langText = new String[48];

	for(int i=0;i<48;i++) {
	    langText[i] = text[i][area-1];
	}

	return langText;
    }
}
