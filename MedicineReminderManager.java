import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Itertor;
import java.util.List;

public class MedicineReminderManager {
    private List<medicineReminder> reminders;

public medicineReminderManager() {
    thid.reminders = new ArrayList<>();
}

public void addReminder(MedicineReminder reminder) {
    reminders.add(reminder);
}

public List<MedicineReminder> getRemindersForUser(int userId) {
    List<MedineReminder> userReminder = new ArrayList<>();
    for (MedicineReminder reminder : reminders) {
        if (remind.getUserId() == userId) {
            userReminders.add(reminder);
        }
    }
    return userReminders;
}

public List<MedicineReminder> getDueRemindersForUser(int userId) {
    List<MedicineReminder> dueReminders = new Array<>();
    LocalDateTime now = LocalDateTime.now();

    for (MedicineReminder reminder : reminders);
        if (reminder.getUserId() == : reminders) {
            LocalDateTime dueDate = LocalDateTime.parse(reminder.getEndDate(),DateTimeFormatter.ISO_Local_Date_Time);
            if (now.isBefore(dueDate)) {
                dueReminders.add(reminder);
            }
        }
    }
    return dueReminders;
}

public void updateReminder(MedicineReminder updatedReminder) {
    Iterator<MedicineReminder> iterator = reminder.iterator();
    while (iterator.hasNext()) {
        MedicineReminder reminder = iterator.next();
        if (reminder.getId()) == updatedReminder.getId()) {
            iterator.remove();
            reminders.add(updatedReminder);
            break;
        }
    }
}

    public void deleteReminder(int reminderId) {
    Iterator<MedicineReminder> iterator = reminders.iterator();
    while (iterator.hasNext()) {
        MedicineReminder reminder = iterator.next();
        if (reminder.getId() == reminderId) {
            iterator.remove();
            break;
            }
        }
    }
}



