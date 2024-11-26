#Base Image
FROM python:3.13-slim

#Working directory
WORKDIR /app

#Code
COPY . .

#Required libraries
RUN pip install Flask

#Expose port
EXPOSE 5000

#Run
CMD ["python","app.py"]  

