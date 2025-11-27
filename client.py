# -----------------------------------------------------------
# IPC Using Sockets in Python
# CLIENT PROGRAM (Sender)
# -----------------------------------------------------------

import socket

def start_client():
    host = "127.0.0.1"  # Server IP
    port = 5000         # Must match server port

    client_socket = socket.socket()
    client_socket.connect((host, port))

    print(f"Connected to server at {host}:{port}")

    while True:
        message = input("Message to server: ")
        client_socket.send(message.encode())

        data = client_socket.recv(1024).decode()
        print(f"Server replied: {data}")

    client_socket.close()


if __name__ == "__main__":
    start_client()
