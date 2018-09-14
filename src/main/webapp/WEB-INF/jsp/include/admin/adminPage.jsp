<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    $(function(){
        $("ul.pagination li.disabled a").click(function(){
            return false;
        });
    });

</script>

<nav>
    <ul class="pagination">
        <c:if test="${!page.isFirstPage}">
            <li>
                <a  href="?start=${page.navigateFirstPage}${params}" aria-label="Previous" >
                    <span aria-hidden="true">«</span>
                </a>
            </li>
            <li>
                <a  href="?start=${page.prePage}${params}" aria-label="Previous" >
                    <span aria-hidden="true">‹</span>
                </a>
            </li>
        </c:if>

        <c:forEach items="${page.navigatepageNums}" var="nav" varStatus="status">
            <c:if test="${nav==page.pageNum}">
                <li>
                    <a href="?start=${nav}${params}" class="current">${nav}</a>
                </li>
            </c:if>
            <c:if test="${nav!=page.pageNum}">
                <li>
                    <a href="?start=${nav}${params}">${nav}</a>
                </li>
            </c:if>
        </c:forEach>

        <c:if test="${!page.isLastPage}">
            <li>
                <a href="?start=${page.nextPage}${params}" aria-label="Next">
                    <span aria-hidden="true">›</span>
                </a>
            </li>
            <li>
                <a href="?start=${page.navigateLastPage}${params}" aria-label="Next">
                    <span aria-hidden="true">»</span>
                </a>
            </li>
        </c:if>
    </ul>
</nav>
