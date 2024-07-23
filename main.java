/**
 * Title: V4 AIO Auto Dart Maker Hinamizawa
 * Description: This script is used to automatically make darts in the game.
 *               The user can choose the type of dart they want to make.
 *               The script will automatically make the chosen type of dart
 *               until it runs out of feathers.
 *               The script uses the VSwitcher plugin to interact with the game.
 */
//Title: V4 AIO Auto Dart Maker Hinamizawa
//____________________________________________________________________________________________
//Users Decision variables Down Below:
int user_decision = 5;
//1 bronze
//2 Iron
//3 Steel
//4 Mithril
//5 Adamant
//6 Rune
//7 Dragon
//8 Amaethyst
//____________________________________________________________________________________________
//Hinamizawa's codes down below:
int feathersId = 314;
int feathSlot = v.getInventory().slot(feathersId);
int dartTip;
int dartSlot;
int dartCount;
int hinaCounter = 0;

private void dartMaker() {
    if (user_decision == 1) {
        //bronze
        dartTip = 819;
    } else if (user_decision == 2) {
        //Iron
        dartTip = 820;
    } else if (user_decision == 3) {
        //Steel
        dartTip = 821;
    } else if (user_decision == 4) {
        //Mithril
        dartTip = 822;
    } else if (user_decision == 5) {
        //Adamant
        dartTip = 823;
    } else if (user_decision == 6) {
        //Rune
        dartTip = 824;
    } else if (user_decision == 7) {
        //Dragon
        dartTip = 11232;
    } else if (user_decision == 8) {
        //Amethyst
        dartTip = 25853;
    }
    dartSlot = v.getInventory().slot(dartTip);
    dartCount = v.getInventory().count(dartTip);
}

dartMaker();

while (dartCount > hinaCounter) {
    v.invoke("Use", "<col=ff9040>Feather</col>", 0, 25, feathSlot, 9764864, false);
    v.invoke("Use", "<col=ff9040>Feather</col><col=ffffff> -> <col=ff9040>Adamant dart tip</col>", 0, 58, dartSlot, 9764864, false);
    hinaCounter++;
    dartCount = v.getInventory().count(dartTip);
}
