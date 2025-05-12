# מחקר על מערכת הקבצים בג'אווה

## 1. כיצד יוצרים תיקייה בג'אווה?

### הסבר קצר:
בג'אווה ניתן ליצור תיקייה בעזרת המחלקה `File` או `Files`. השיטה הנפוצה היא להשתמש ב-`mkdir()` או `mkdirs()` כדי ליצור תיקייה אחת או עץ תיקיות.

### דוגמת קוד:
```java
import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File directory = new File("exampleDir");
        if (directory.mkdir()) {
            System.out.println("התיקייה נוצרה בהצלחה");
        } else {
            System.out.println("יצירת התיקייה נכשלה");
        }
    }
}
```

### מקור:
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#mkdir--

---

## 2. כיצד יוצרים קובץ?

### הסבר קצר:
ליצירת קובץ ניתן להשתמש במחלקה `File` יחד עם `createNewFile()`. פעולה זו יוצרת קובץ ריק אם הוא לא קיים.

### דוגמת קוד:
```java
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("הקובץ נוצר בהצלחה");
            } else {
                System.out.println("הקובץ כבר קיים");
            }
        } catch (IOException e) {
            System.out.println("שגיאה ביצירת הקובץ");
            e.printStackTrace();
        }
    }
}
```

### מקור:
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#createNewFile--

---

## 3. כיצד בודקים אם קובץ/תיקייה קיים?

### הסבר קצר:
ניתן לבדוק אם קובץ או תיקייה קיימים באמצעות `exists()` של המחלקה `File`.

### דוגמת קוד:
```java
import java.io.File;

public class CheckExistence {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("הקובץ קיים");
        } else {
            System.out.println("הקובץ לא קיים");
        }
    }
}
```

### מקור:
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#exists--

---

## 4. כיצד מציגים את תוכן התיקייה?

### הסבר קצר:
כדי להציג את תוכן התיקייה משתמשים בשיטה `list()` או `listFiles()` של המחלקה `File`.

### דוגמת קוד:
```java
import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {
        File dir = new File(".");
        String[] files = dir.list();
        if (files != null) {
            for (String name : files) {
                System.out.println(name);
            }
        }
    }
}
```

### מקור:
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#list--

---

## 5. מה ההבדל בין קובץ לנתיב?

### הסבר קצר:
נתיב הוא מחרוזת שמייצגת מיקום בקובץ מערכת (למשל: `C:/Users/test/file.txt`), בעוד שקובץ הוא יישות ממשית שמכילה מידע או נתונים ונגישה דרך מחלקות כמו `File` או `Path`.

### דוגמת קוד:
```java
import java.io.File;

public class FileVsPath {
    public static void main(String[] args) {
        File file = new File("example.txt");
        System.out.println("נתיב: " + file.getPath());
        System.out.println("קיים: " + file.exists());
    }
}
```

### מקור:
https://docs.oracle.com/javase/8/docs/api/java/io/File.html

---
