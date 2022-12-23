package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class TestUniswapV3SwapPay extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506104a6806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063f13cdf901461003b578063fa461e331461008f575b600080fd5b61008d600480360360e081101561005157600080fd5b506001600160a01b0381358116916020810135821691604082013515159160608101359091169060808101359060a08101359060c0013561010b565b005b61008d600480360360608110156100a557600080fd5b8135916020810135918101906060810160408201356401000000008111156100cc57600080fd5b8201836020820111156100de57600080fd5b8035906020019184600183028401116401000000008311171561010057600080fd5b509092509050610253565b866001600160a01b031663128acb088787868833888860405160200180846001600160a01b0316815260200183815260200182815260200193505050506040516020818303038152906040526040518663ffffffff1660e01b815260040180866001600160a01b031681526020018515158152602001848152602001836001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b838110156101cf5781810151838201526020016101b7565b50505050905090810190601f1680156101fc5780820380516001836020036101000a031916815260200191505b5096505050505050506040805180830381600087803b15801561021e57600080fd5b505af1158015610232573d6000803e3d6000fd5b505050506040513d604081101561024857600080fd5b505050505050505050565b60008060008484606081101561026857600080fd5b506001600160a01b03813516935060208101359250604001359050811561037957336001600160a01b0316630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b1580156102c257600080fd5b505afa1580156102d6573d6000803e3d6000fd5b505050506040513d60208110156102ec57600080fd5b5051604080516323b872dd60e01b81526001600160a01b03868116600483015233602483015260448201869052915191909216916323b872dd9160648083019260209291908290030181600087803b15801561034757600080fd5b505af115801561035b573d6000803e3d6000fd5b505050506040513d602081101561037157600080fd5b506104679050565b801561046757336001600160a01b031663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b1580156103b857600080fd5b505afa1580156103cc573d6000803e3d6000fd5b505050506040513d60208110156103e257600080fd5b5051604080516323b872dd60e01b81526001600160a01b03868116600483015233602483015260448201859052915191909216916323b872dd9160648083019260209291908290030181600087803b15801561043d57600080fd5b505af1158015610451573d6000803e3d6000fd5b505050506040513d602081101561024857600080fd5b5050505050505056fea2646970667358221220d1915b60534c1636cabd4a43f09198e7a2d377acbe547106b769ac207f450f4164736f6c63430007060033";

    public static final String FUNC_SWAP = "swap";

    public static final String FUNC_UNISWAPV3SWAPCALLBACK = "uniswapV3SwapCallback";

    @Deprecated
    protected TestUniswapV3SwapPay(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TestUniswapV3SwapPay(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TestUniswapV3SwapPay(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TestUniswapV3SwapPay(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> swap(String pool, String recipient, Boolean zeroForOne, BigInteger sqrtPriceX96, BigInteger amountSpecified, BigInteger pay0, BigInteger pay1) {
        final Function function = new Function(
                FUNC_SWAP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.Address(160, recipient), 
                new org.web3j.abi.datatypes.Bool(zeroForOne), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceX96), 
                new org.web3j.abi.datatypes.generated.Int256(amountSpecified), 
                new org.web3j.abi.datatypes.generated.Uint256(pay0), 
                new org.web3j.abi.datatypes.generated.Uint256(pay1)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> uniswapV3SwapCallback(BigInteger param0, BigInteger param1, byte[] data) {
        final Function function = new Function(
                FUNC_UNISWAPV3SWAPCALLBACK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int256(param0), 
                new org.web3j.abi.datatypes.generated.Int256(param1), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static TestUniswapV3SwapPay load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TestUniswapV3SwapPay(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TestUniswapV3SwapPay load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TestUniswapV3SwapPay(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TestUniswapV3SwapPay load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TestUniswapV3SwapPay(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TestUniswapV3SwapPay load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TestUniswapV3SwapPay(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TestUniswapV3SwapPay> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TestUniswapV3SwapPay.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TestUniswapV3SwapPay> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TestUniswapV3SwapPay.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<TestUniswapV3SwapPay> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TestUniswapV3SwapPay.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TestUniswapV3SwapPay> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TestUniswapV3SwapPay.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
