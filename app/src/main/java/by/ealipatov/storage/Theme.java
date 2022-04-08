package by.ealipatov.storage;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import by.ealipatov.R;


public enum Theme {
        ONE(R.style.Theme_MyApplication, R.string.theme_one, "THEME_ONE"),
        TWO(R.style.Theme_MyApplication_Green, R.string.theme_two, "THEME_TWO");

        private @StyleRes
        final int theme;

        private @StringRes
        final int title;
        private final String key;


        Theme(int theme, int title, String key) {
            this.theme = theme;
            this.title = title;
            this.key = key;
        }

        public int getTitle() {
            return title;
        }

        public String getKey() {
            return key;
        }

        public int getTheme() {
            return theme;
        }

}
