package org.jboss.sample.todolist.html;

import java.util.List;

import org.jboss.sample.todolist.domain.Task;

/**
 * @author Matej Lazar
 */
public class HtmlHelper {

    public static String taskListAsHtml(List<Task> tasks, String q) {
        String html = "<p class=\"taskList\">\n";
        for (Task task : tasks) {
            String onClick="onclick=\"document.location='?q=" + q + "&" + (task.isTaskDone() ? "markNotDone" : "markDone") + "=" + task.getId() + "'\"";

            html += "<p class=\"task\">\n";
            html += "<input type=\"checkbox\"" + (task.isTaskDone() ? "checked=\"checked\"" : "");
            html += " " + onClick + "/>\n";
            html += "<span " + onClick + " class=\"" + (task.isTaskDone() ? "taskDone" : "") + "\">" +  task.getMessage() + "</span>\n";
            html += "</p>\n";
        }
        html += "</p>\n";
        return html;
    }

}
