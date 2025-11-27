# -----------------------------------------------------------
# IPC Using Sockets in Python
# SERVER PROGRAM (Receiver)
# -----------------------------------------------------------

import socket

def start_server():
    host = "127.0.0.1"  # Localhost
    port = 5000         # Port to listen on

    # Create socket
    server_socket = socket.socket()
    server_socket.bind((host, port))
    server_socket.listen(1)

    print(f"Server started. Waiting for connection on {host}:{port}...")

    conn, address = server_socket.accept()
    print(f"Connected by {address}")

    while True:
        data = conn.recv(1024).decode()
        if not data:
            break  # Connection closed

        print(f"Client says: {data}")

        # Send reply back
        message = input("Reply to client: ")
        conn.send(message.encode())

    conn.close()


if __name__ == "__main__":
    start_server()
