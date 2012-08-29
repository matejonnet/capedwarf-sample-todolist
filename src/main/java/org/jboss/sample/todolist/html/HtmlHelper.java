package org.jboss.sample.todolist.html;

import java.util.List;

import org.jboss.sample.todolist.domain.Task;

/**
 * @author Matej Lazar
 */
public class HtmlHelper {

    public static String taskListAsHtml(List<Task> tasks, String q) {
        String html = "<form method=\"GET\">\n";
        html += "<p class=\"taskList\">\n";
        for (Task task : tasks) {
            html += "<p class=\"task\">\n";
            html += "<input type=\"checkbox\" name=\"taskDone\" value=\"" +  task.getId() + "\" " + (task.isTaskDone() ? "checked=\"checked\" disabled=\"disabled\"" : "") + "/>\n";
            html += "<span class=\"" + (task.isTaskDone() ? "taskDone" : "") + "\">" +  task.getMessage() + "</span>\n";
            html += "</p>\n";
        }
        html += "</p>\n";
        html += "<input type=\"hidden\" name=\"q\" value=\"" + q + "\" />\n";
        html += "<input type=\"submit\" value=\"update\" />\n";
        html += "</form>\n";
        return html;
    }

}
