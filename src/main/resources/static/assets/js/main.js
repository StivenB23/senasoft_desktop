const deleteClient = (id) => {
  Swal.fire({
    title: "Porfavor introduce el id seleccionado para confirmar",
    input: "text",
    inputAttributes: {
      autocapitalize: "off",
    },
    showCancelButton: true,
    confirmButtonText: "Eliminar",
    showLoaderOnConfirm: true,
    preConfirm: (text) => {
      if (text === id) {
        Swal.fire("Correcto", "El cliente ha sido eliminado", "success").then(
          (result) => {
            window.location.href = `/clientes/delete/${id}`;
          }
        );
      } else {
        Swal.fire("Cliente no eliminado", "El id no coincide", "error").then((result) => {
          window.location.href = `/clientes`;
        });
      }
    },
  });
};
const changeStatus = (id) => {
  const swalWithBootstrapButtons = Swal.mixin({
    customClass: {
      confirmButton: "btn btn-primary mx-2",
      cancelButton: "btn btn-danger",
    },
    buttonsStyling: false,
  });

  swalWithBootstrapButtons
    .fire({
      title: "Estas seguro de cambiar el estado?",
      text: "No podras revertir esta accion!",
      icon: "warning",
      showCancelButton: true,
      confirmButtonText: "Si, Confirmar!",
      cancelButtonText: "No, Cancelar!",
      reverseButtons: true,
    })
    .then((result) => {
      if (result.isConfirmed) {
        swalWithBootstrapButtons
          .fire(
            "Actualizado!",
            "El estado ah cambiado satsifactoriamente",
            "Exito"
          )
          .then((result) => {
            window.location.href = `/clientes/edit/${id}`;
          });
      } else if (
        /* Read more about handling dismissals below */
        result.dismiss === Swal.DismissReason.cancel
      ) {
        swalWithBootstrapButtons.fire(
          "Cancelado",
          "Su archivo imaginario es seguro:)",
          "error"
        );
      }
    });
};
