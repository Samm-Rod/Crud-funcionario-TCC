package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.FuncionarioDAO;
import java.util.ArrayList;
import model.Funcionario;

public final class form_005ffuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale\" name=\"viewport\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"datatables/datatables.min.css\">\n");
      out.write("        <title>Crud funcionário</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      out.write("<div class=\"menu\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"#\">Início</a></li>\n");
      out.write("        <li><a href=\"form_funcionario.jsp\">Cadastrar</a></li>\n");
      out.write("        <li><a href=\"#\">Menus</a></li>\n");
      out.write("        <li><a href=\"#\">Usuarios</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"estilo/menu.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("            <h1>Cadastrar funcionário<h1>   \n");
      out.write("            <form action=\"gerenciar_funcionario.do\" method=\"POST\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"nome\" class=\"control-label\">Nome</label>\n");
      out.write("                        <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"nome\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"dataNasc\" class=\"control-label\">Data Nascimento</label>\n");
      out.write("                        <input type=\"date\" name=\"dataNasc\" class=\"form-control\" id=\"dataNasc\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario.dataNasc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"cpf\" class=\"control-label\">CPF</label>\n");
      out.write("                        <input type=\"text\" name=\"cpf\" class=\"form-control\" id=\"cpf\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"tel\" class=\"control-label\">Telefone</label>\n");
      out.write("                        <input type=\"text\" name=\"tel\" class=\"form-control\" id=\"tel\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario.tel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <label for=\"matricula\" class=\"control-label\">Matricula</label>\n");
      out.write("                        <input type=\"text\" name=\"matricula\" class=\"form-control\" id=\"matricula\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario.matricula}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-sm-8\">\n");
      out.write("                        <button class=\"btn btn-sucess\">Cadastrar</button>\n");
      out.write("                        <a href=\"listar_funcionario.jsp\" class=\"btn btn-warning\">Voltar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </form>           \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
