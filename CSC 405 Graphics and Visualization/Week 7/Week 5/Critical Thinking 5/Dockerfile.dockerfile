FROM nginx

COPY Common /usr/share/nginx/html/Common
COPY ["ortho.html", "othro.js", "/usr/share/nginx/html/"]