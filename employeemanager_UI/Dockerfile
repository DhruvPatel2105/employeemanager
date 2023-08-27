# Use an official Node.js runtime as the base image
FROM node:latest as builder

# Set the working directory
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the entire project to the working directory
COPY . .

# Build the Angular app
RUN npm run build

# Use a smaller, production-ready image for serving the app
FROM nginx:alpine

# Copy the build output from the builder stage to the NGINX server directory
COPY --from=builder /app/dist/employeemanager-ui /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Start NGINX
CMD ["nginx", "-g", "daemon off;"]
