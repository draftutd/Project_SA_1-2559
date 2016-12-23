package org.apache.jsp.WEB_002dINF.views.purchase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addpurchase_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/xml;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>");
      out.write("<head>");
      out.write("<TITLE>");
      out.write("ระบบสั่งชื้อสินค้าเข้าร้าน");
      out.write("</TITLE>");
      out.write("<style>");
      out.write("\n");
      out.write("table, th, td {\n");
      out.write("    border: 0px;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>");
      out.write("</head>");
      out.write("<body>");
      out.write("<script>");
      out.write("\n");
      out.write("    function createPuches() {\n");
      out.write("        var data = $('#formCustomer').serialize();\n");
      out.write("        data += \"$amp;employee\" + $('#employee').children(\":selected\").attr(\"id\");\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"createpurchase\",\n");
      out.write("            type: \"POST\",\n");
      out.write("            data: data,\n");
      out.write("            success: function(){\n");
      out.write("                alert(\"กดเมนู แสดงประวัติการสั่งซื้อทั้งหมด เพื่อดูรายการที่สั่งซื้อแล้ว\");\n");
      out.write("                location.reload()\n");
      out.write("            },\n");
      out.write("            error: function(){\n");
      out.write("                alert(\"fail\")\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function changePurchase(idOrder){\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"changePurchase\",\n");
      out.write("            type: \"GET\",\n");
      out.write("            data: {\n");
      out.write("            \tidOrder: idOrder.id\n");
      out.write("            },\n");
      out.write("            success: function(data){\n");
      out.write("                location.reload()\n");
      out.write("            },\n");
      out.write("            error: function(){\n");
      out.write("                sweetAlert(\"fail\")\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    ");
      out.write("</script>");
      out.write("<div aria-label=\"...\" role=\"group\" class=\"btn-group btn-group-justified\">");
      out.write("<div role=\"group\" class=\"btn-group\">");
      out.write("<a href=\"http://localhost:8080/draft/purchase/all\">");
      out.write("<button class=\"btn btn-default\" type=\"button\">");
      out.write("แสดงประวัติการสั่งชื้อทั้งหมด");
      out.write("</button>");
      out.write("</a>");
      out.write("</div>");
      out.write("<div role=\"group\" class=\"btn-group\">");
      out.write("<a href=\"http://localhost:8080/draft/purchase/add\">");
      out.write("<button class=\"btn btn-default\" type=\"button\">");
      out.write("เพิ่มประวัติการสั่งชื้อ");
      out.write("</button>");
      out.write("</a>");
      out.write("</div>");
      out.write("</div>");
      out.write("<p>");
      out.write("<strong>");
      out.write("<h2>");
      out.write("เพิ่มประวัติการสั่งชื้อ");
      out.write("</h2>");
      out.write("</strong>");
      out.write("</p>");
      out.write("<form method=\"post\" name=\"createPuches\" id=\"createPuches\">");
      out.write("<table class=\"table table-bordered\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("ผู้สั่งชื้อ");
      out.write("</td>");
      out.write("<td>");
      out.write("<select style=\"width: 200px\" name=\"employeeName\" id=\"employeeName\">");
      out.write("<option disabled=\"disabled\" selected=\"selected\" value=\"\">");
      out.write("Employee Name");
      out.write("</option>");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</select>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("รายการสินค้า");
      out.write("</td>");
      out.write("<td>");
      out.write("<input size=\"80\" id=\"productName\" name=\"productName\" type=\"text\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("จำนวน");
      out.write("</td>");
      out.write("<td>");
      out.write("<input size=\"20\" id=\"productAmount\" name=\"productAmount\" type=\"text\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("ราคา");
      out.write("</td>");
      out.write("<td>");
      out.write("<input size=\"20\" id=\"price\" name=\"price\" type=\"text\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("สถานะการสั่งชื้อ");
      out.write("</td>");
      out.write("<td>");
      out.write("<input name=\"status\" id=\"status\" type=\"checkbox\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("วันที่สั่งชื้อ");
      out.write("</td>");
      out.write("<td>");
      out.write("<input value=\"2014-02-09\" name=\"StringDate\" id=\"StringDate\" type=\"date\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("<br>");
      out.write("<button onclick=\"createPuches()\" class=\"btn btn-default\" type=\"submit\">");
      out.write("ยืนยัน");
      out.write("</button>");
      out.write("</br>");
      out.write("<br />");
      out.write("</form>");
      out.write("<table class=\"table table-bordered\">");
      out.write("<tr>");
      out.write("<th>");
      out.write("เลขที่");
      out.write("</th>");
      out.write("<th>");
      out.write("ผู้สังชื่อ");
      out.write("</th>");
      out.write("<th>");
      out.write("รายการสินค้า");
      out.write("</th>");
      out.write("<th>");
      out.write("จำนวน");
      out.write("</th>");
      out.write("<th>");
      out.write("ราคา");
      out.write("</th>");
      out.write("<th>");
      out.write("สถานะการสั่งชื้อ");
      out.write("</th>");
      out.write("<th>");
      out.write("วันที่สั่งชื้อ");
      out.write("</th>");
      out.write("<th />");
      out.write("</tr>");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("</table>");
      out.write("</body>");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listEmployee}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("employee");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.id}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listOrder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("order");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status != true }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<tr>");
        out.write("<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>");
        out.write("<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.employeeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>");
        out.write("<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>");
        out.write("<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.productAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>");
        out.write("<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>");
        out.write("<td>");
        out.write("ยังไม่ได้สั่งซื้อ");
        out.write("</td>");
        out.write("<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.stringDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>");
        out.write("<th>");
        out.write("<input class=\"btn btn-default\" onclick=\"changePurchase(this)\" value=\"ยืนยันการสั่งซื้อ\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" type=\"button\" />");
        out.write("</th>");
        out.write("</tr>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
