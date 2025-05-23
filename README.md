# פרויקט: פעולות בסיסיות על מערכת הקבצים בג'אווה

## תיאור כללי

פרויקט זה מציג דוגמאות בשפת Java לעבודה עם מערכת הקבצים: יצירת קובץ, יצירת תיקייה, בדיקת קיום של קובץ או תיקייה, קריאת תוכן תיקייה והסבר על ההבדל בין קובץ לנתיב.  
המטרה היא להבין כיצד ניתן לגשת לקבצים ולנהל אותם באופן פשוט בשפת Java.

## הוראות קומפילציה והרצה

1. ודא שהתקנת את JDK (גרסה 8 ומעלה).
2. פתח שורת פקודה או טרמינל בתיקייה שבה נמצאים קבצי `.java`.
3. קמפל את הקבצים עם הפקודה:
   ```bash
   javac *.java
   ```
4. הרץ כל תוכנית בעזרת הפקודה:
   ```bash
   java CreateFile
   ```

## דוגמת הרצה

```bash
$ javac CreateFile.java
$ java CreateFile
הקובץ נוצר בהצלחה
```

## הערות קוד

הקוד כולל הערות פנימיות (באנגלית או בעברית) המסבירות את תפקיד כל שיטה, לדוגמה:

```java
// יוצר אובייקט מסוג File עבור קובץ
File file = new File("example.txt");

// בודק אם הקובץ קיים
if (file.exists()) {
    System.out.println("הקובץ כבר קיים");
} else {
    System.out.println("הקובץ לא קיים");
}
```

## קבצים בפרויקט

- `CreateDirectory.java` – יצירת תיקייה.
- `CreateFile.java` – יצירת קובץ חדש.
- `CheckExistence.java` – בדיקת קיום של קובץ/תיקייה.
- `ListDirectory.java` – הדפסת תוכן תיקייה.
- `FileVsPath.java` – הצגת ההבדל בין קובץ לנתיב.
