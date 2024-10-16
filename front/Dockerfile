# Étape 1 : Construction du frontend avec Node.js
FROM node:18 AS build

# Crée un répertoire de travail
WORKDIR /app

# Copie les fichiers de configuration (package.json, package-lock.json, etc.)
COPY package*.json ./

# Installe les dépendances
RUN npm install

# Copie le reste des fichiers du frontend
COPY . .

# Compile le frontend (par exemple, pour React ou Angular)
RUN npm run build

# Étape 2 : Serveur web avec NGINX
FROM nginx:alpine

# Copie les fichiers compilés dans NGINX
COPY --from=build /app/build /usr/share/nginx/html

# Expose le port 80
EXPOSE 80

# Démarre NGINX
CMD ["nginx", "-g", "daemon off;"]
