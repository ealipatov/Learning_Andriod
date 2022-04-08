package by.ealipatov.storage;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeStorage {

    private static final String THEME_KEY = "THEME_KEY";

    private static ThemeStorage INCTANCE;
    private final Context context;
    private final SharedPreferences sharedPreferences;


    public static ThemeStorage getInstance(Context context) {
        if (INCTANCE == null){
            INCTANCE = new ThemeStorage(context);
        }
        return INCTANCE;
    }
    private ThemeStorage(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("preferences", Context.MODE_PRIVATE);
    }

    public void saveTheme(Theme theme) {
        sharedPreferences.edit()
                .putString(THEME_KEY, theme.getKey())
                .apply();
    }

    public Theme getTheme() {
        String savedValueTheme = sharedPreferences.getString(THEME_KEY, Theme.ONE.getKey());

        for (Theme theme : Theme.values()) {
            if (theme.getKey().equals(savedValueTheme)) {
                return theme;
            }
        }

        return Theme.ONE;
    }

}
