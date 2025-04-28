# Use a minimal, secure base image
FROM nginx:1.19-alpine
# Set labels (good for security scans and documentation)
LABEL maintainer="sumankumarp9689@accionlabs.com"
LABEL org.opencontainers.image.source="https://github.com/ Accion-Labs"
# Remove unnecessary files to minimize image size and reduce attack surface
RUN rm -rf /var/cache/apk/* /tmp/* /var/tmp/*
# Copy a custom nginx.conf if you want (optional step)
# COPY nginx.conf /etc/nginx/nginx.conf
# Set a non-root user if needed (nginx on Alpine already runs as non-root inside container)
USER nginx
# Expose HTTP port
EXPOSE 80
# Define default command
CMD ["nginx", "-g", "daemon off;"]
