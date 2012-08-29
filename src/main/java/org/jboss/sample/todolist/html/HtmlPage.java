package org.jboss.sample.todolist.html;

/**
 * @author Matej Lazar
 */
public class HtmlPage {

    private String body = "";
    private final String ctxPath;

    public HtmlPage(String ctxPath) {
        this.ctxPath = ctxPath;
    }

    public String getHtml() {
        String html="<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "<title>ToDo List</title>\n" +
                "<link type=\"text/css\" rel=\"stylesheet\" href=\"" +  ctxPath + "/css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                body + "\n" +
                "</body>\n" +
                "</html>\n";
        return html;
    }

    public void addToBody(String html) {
        this.body += html;
    }

    public void addInputForm(String q) {
        this.body += "<form method=\"GET\">" +
        		"<p>" +
        		"new task: <input type=\"text\" name=\"message\" />\n" +
        		"<input type=\"submit\" value=\"add\" />\n" +
        		"</p>\n" +
                "<p>\n" +
        		"search: <input type=\"text\" name=\"q\" value=\""+ q + "\" />\n" +
        		"<input type=\"submit\" value=\"search\" />\n" +
        		"</p>\n" +
        		"</form>\n";
    }
}
